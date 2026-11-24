class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                dp[i][j]=2;
            }
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],i);
        }
        int max = 0 ; 
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(map.containsKey(arr[j]-arr[i])){
                    int idx = map.get(arr[j]-arr[i]);
                    if(idx<i){
                        dp[i][j]=dp[idx][i]+1;
                    max=Math.max(max,dp[i][j]);
                    }
                }
                    
            }
        }
        return max ; 
    }
}
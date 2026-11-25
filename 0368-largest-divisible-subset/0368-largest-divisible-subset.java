class Solution {
    public List<Integer> largestDivisibleSubset(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);
        ArrayList<Integer> al = new ArrayList<>();
        int[] dp = new int[n];
        dp[n-1]=1;
        int tru_max=1;
        for(int i=n-2;i>=0;i--){
            int max = 1  ; 
            for(int j=i+1;j<n;j++){
                if(arr[j]%arr[i]==0){
                    max = Math.max(max,dp[j]+1);
                }
            }
            dp[i]=max;
            tru_max=Math.max(tru_max,dp[i]);
        }
        int i =0;
        int idx = -1;
        for( i=0;i<n;i++){
            if(dp[i]==tru_max){
                al.add(arr[i]);
                idx = i ; 
                i++;
                break;
            }
        }
        int tar = dp[idx];
        while(i<n){
            if(dp[i]==tar-1){
                if(arr[i] % al.get(al.size()-1)==0){
                    al.add(arr[i]);
                    tar--;
                }
            }
            i++;
        }
        return al;
    }
}
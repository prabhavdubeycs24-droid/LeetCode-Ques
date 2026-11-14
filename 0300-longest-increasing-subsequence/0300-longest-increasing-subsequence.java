class Solution {
    public int lengthOfLIS(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0]=1;
        int tru_max = 1;
        for(int i=1;i<arr.length;i++){
            int max = -1;
            for(int j=i;j>=0;j--){
                if(arr[i]>arr[j]){
                    max = Math.max(max,dp[j]);
                }
            }
            if(max!=-1){
                dp[i]=max+1;
            }
            else{
                dp[i]=1;
            }
            tru_max=Math.max(tru_max,dp[i]);
        }
        return tru_max;
    }
}
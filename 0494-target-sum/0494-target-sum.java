class Solution {
    static int sum ; 
    public int findTargetSumWays(int[] arr, int target) {
        sum = 0 ; 
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        int[][] dp = new int[arr.length][(2*sum)+1];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        if(target>sum){
            return 0 ; 
        }
        return helper(0,0,arr,target,dp);
    }
    public static int helper(int idx ,int currsum , int[] arr,int target,int[][] dp){
        
        if(idx==arr.length){
            if(target==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        if(dp[idx][currsum+sum]!=-1){
            return dp[idx][currsum+sum];
        }
        int plus = helper(idx+1,currsum+arr[idx],arr,target-arr[idx],dp);
        int minus = helper(idx+1,currsum-arr[idx],arr,target+arr[idx],dp);
        dp[idx][currsum+sum] =  plus+minus;
        return plus+minus;
    }
}
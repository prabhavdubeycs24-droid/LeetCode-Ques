class Solution {
    static int[] dp ; 
    public static int helper(int idx , int[] arr){
        if(dp[idx]!=-1){
            return dp[idx];
        }
        if(idx==arr.length-1 || idx==arr.length-2){
            dp[idx]=arr[idx];
            return arr[idx];
        }
        int ans =  arr[idx] + Math.min(helper(idx+1,arr),helper(idx+2,arr));
        dp[idx]=ans;
        return ans ; 
    }
    public int minCostClimbingStairs(int[] cost) {
        // start at either 0 or 1 , take minimum of both 
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(helper(0,cost),helper(1,cost));
    }
}
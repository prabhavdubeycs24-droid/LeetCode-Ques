class Solution {
    static int[] dp ; 
    public static int helper(int n){
        if(dp[n-1]!=-1){
            return dp[n-1];
        }
        if(n<=2){
            return n ;
        }
        int ans =  helper(n-1) + helper(n-2);
        dp[n-1]=ans;
        return ans;
    }
    public int climbStairs(int n) {
        dp = new int[n];
        Arrays.fill(dp,-1);
        dp[0]=1; //1 
        if(dp.length>1) dp[1]=2; //2
        return helper(n);
    }
}
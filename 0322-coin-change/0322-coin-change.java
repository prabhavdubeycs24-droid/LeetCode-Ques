class Solution {
    static int[][] dp ;
    public int coinChange(int[] coins, int amount) { 
        if(amount==0){
            return 0 ; 
        }
        dp = new int[coins.length][amount+1];
        int ans =  solve(0,coins,amount);
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
    public static int solve(int i , int[] coins , int amount ){
        if(amount==0){
            return 0 ; 
        }
        if(i==coins.length){
            if(amount==0){
                return 0;
            }
            else{
                return Integer.MAX_VALUE;
            }
        }
        if(dp[i][amount]!=0){
            return dp[i][amount];
        }
        int skip = solve(i+1,coins,amount);
        int pick = Integer.MAX_VALUE;
        if(amount<coins[i]) return skip;
        int take = solve(i,coins,amount-coins[i]);
        if(take!=Integer.MAX_VALUE){
            pick = 1+take;
        }
        int ans =  Math.min(pick,skip);
        dp[i][amount]=ans;
        return ans;
    }
}
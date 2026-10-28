class Solution {
    static int[] dp;
    public int ans(int n){
        if( n==0 || n==1){
            return n ; 
        }
        if(dp[n]!=0){
            return dp[n];
        }
        int ans = ans(n-1)+ans(n-2);
        dp[n]=ans;
        return ans ; 
    }
    public int fib(int n) {
        dp = new int[n+1];
        return ans(n);

    }
}
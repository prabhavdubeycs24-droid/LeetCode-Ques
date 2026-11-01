class Solution {
    static int[][] dp ;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        return solve(m-1,n-1);
    }
    public static int solve(int m, int n){
        if(dp[m][n]!=0){
            return dp[m][n];
        }
        if(m==0 || n==0){
            dp[m][n]=1;
            return 1;
        }
        int ans = solve(m-1,n)+solve(m,n-1);
        dp[m][n]=ans;
        return ans ; 
    }
}
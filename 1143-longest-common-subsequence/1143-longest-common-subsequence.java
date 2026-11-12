class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m-1,n-1,text1,text2,dp);
    }
    public static int helper(int m , int n, String text1 , String text2,int[][] dp){
        if(m==-1 || n==-1){
            return 0;
        }
        if(dp[m][n]!=-1){
            return dp[m][n];
        }
        if(text1.charAt(m)==text2.charAt(n)){
            return dp[m][n] =  1+helper(m-1,n-1,text1,text2,dp);
        }
        else{
            int x = helper(m-1,n,text1,text2,dp);
            int y = helper(m,n-1,text1,text2,dp);
            return dp[m][n] =  Math.max(x,y);
        }
    }
}
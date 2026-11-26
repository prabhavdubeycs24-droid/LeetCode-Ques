class Solution {
    static int[][] dp ; 
    public int longestCommonSubsequence(String text1, String text2) {
        int m = text1.length();
        int n = text2.length();
        dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j =0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m-1,n-1,text1,text2);
    }
    public static int helper(int i , int j , String s1 , String s2){
        if(i==-1 || j==-1){
            return 0; 
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+helper(i-1,j-1,s1,s2);
        }
        else{
            int skip = helper(i-1,j,s1,s2);
            int pick = helper(i,j-1,s1,s2);
            return dp[i][j] = Math.max(skip,pick);
        }
    }
}
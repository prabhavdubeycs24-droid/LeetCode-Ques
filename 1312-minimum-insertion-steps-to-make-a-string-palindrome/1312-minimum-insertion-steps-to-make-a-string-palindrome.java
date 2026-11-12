class Solution {
    public int minInsertions(String s) {
        String s1 = s;
        String s2 = new StringBuilder(s).reverse().toString();
        int m = s1.length();
        int[][] dp = new int[m][m];
        for(int i=0;i<dp.length;i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int LPS = helper(m-1,m-1,s1,s2,dp);
        return s.length()-LPS;
    }
    public static int helper(int i,int j,String s1 ,String s2,int[][] dp){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=1+helper(i-1,j-1,s1,s2,dp);
        }
        else{
            int p = helper(i-1,j,s1,s2,dp);
            int q = helper(i,j-1,s1,s2,dp);
            return dp[i][j]=Math.max(p,q);
        }

    }
}
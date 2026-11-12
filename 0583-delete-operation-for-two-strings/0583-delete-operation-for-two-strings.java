class Solution {
    public int minDistance(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        int ans = helper(m-1,n-1,s1,s2,dp);
        return (s1.length()+s2.length()-(2*ans));
    }
    public static int helper(int i,int j,String s1, String s2,int[][] dp){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j] =1+helper(i-1,j-1,s1,s2,dp);
        }
        else{
            int a = helper(i-1,j,s1,s2,dp);
            int b = helper(i,j-1,s1,s2,dp);
            return dp[i][j] = Math.max(a,b);
        }
    }
}
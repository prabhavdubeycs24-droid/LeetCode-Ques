class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        int as1 = 0 ; 
        for(int i=0;i<m;i++){
            as1=as1+s1.charAt(i);
        }
        int as2 = 0;
        for(int i=0;i<n;i++){
            as2=as2+s2.charAt(i);
        }
        int finalee = as1+as2;
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+s1.charAt(i-1);
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        
        return finalee-(2*dp[m][n]);
    }
}
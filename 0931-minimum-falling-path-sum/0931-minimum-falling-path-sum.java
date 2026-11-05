class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=matrix[i][j];
                }
                else{
                    if(j+1>=n){
                        dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],dp[i-1][j-1]);
                    }
                    else if(j-1<0){
                        dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],dp[i-1][j+1]);
                    }
                    else{
                        dp[i][j]=matrix[i][j]+Math.min(dp[i-1][j],Math.min(dp[i-1][j-1],dp[i-1][j+1]));
                    }
                    
                }
                if(i==m-1){
                    min = Math.min(min,dp[i][j]);
                }
            }
        }
        return min ; 
    }
}
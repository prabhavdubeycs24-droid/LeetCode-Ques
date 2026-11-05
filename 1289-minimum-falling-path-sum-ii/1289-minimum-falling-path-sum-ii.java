class Solution {
    public int minFallingPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        if(m==1 && n==1){
            return grid[0][0];
        }
        int[][] dp = new int[m][n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0){
                    dp[i][j]=grid[i][j];
                    continue;
                }
                int min1  = Integer.MAX_VALUE;
                for(int k=0;k<n;k++){
                    if(k!=j){
                        min1 = Math.min(min1,grid[i][j]+dp[i-1][k]);
                    }
                }
                dp[i][j]=min1;
                if(i==m-1){
                    min = Math.min(min,dp[i][j]);
                }
            }
        }
        return min ; 
    }
}
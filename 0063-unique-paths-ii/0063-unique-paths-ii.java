class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int m = grid.length;
        int n = grid[0].length;
        if(grid[0][0]==1){
            return 0;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    dp[i][j]=0;
                }
                else{
                    if(i==0 && j==0){
                        dp[i][j]=1;
                    }
                    else if(i==0){
                        dp[i][j]=dp[i][j-1];
                    }
                    else if(j==0){
                        dp[i][j]=dp[i-1][j];
                    }
                    else{
                        dp[i][j]=dp[i-1][j]+dp[i][j-1];
                    }
                }
            }
        }
        return dp[m-1][n-1];
    }
}
class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0 && j==0){
                    dp[i][j]=grid[i][j];
                }
                else{
                    int x ; 
                    int y ;
                    if(i-1<0){
                        x=Integer.MAX_VALUE;
                    }
                    else{
                        x=dp[i-1][j];
                    }
                    if(j-1<0){
                        y = Integer.MAX_VALUE;
                    }
                    else{
                        y = dp[i][j-1];
                    }
                    dp[i][j]=grid[i][j]+Math.min(x,y);
                }
            }
        }
        return dp[grid.length-1][grid[0].length-1];
    }
}
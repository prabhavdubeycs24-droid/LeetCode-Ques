class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n  = triangle.size();
        int[][] dp = new int[n][n];
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            for(int j=0;j<triangle.get(i).size();j++){
                    if(i==0){
                        dp[i][j]=triangle.get(i).get(j);
                    }
                    else{
                        if(j-1<0){
                            dp[i][j]=triangle.get(i).get(j)+dp[i-1][j];
                        }
                        else if(j==i){
                            dp[i][j]=triangle.get(i).get(j)+dp[i-1][j-1];
                        }
                        else{
                            dp[i][j]=triangle.get(i).get(j)+Math.min(dp[i-1][j],dp[i-1][j-1]);
                        }
                        
                    }
                    if(i==n-1){
                        min = Math.min(min,dp[i][j]);
                    }
            }
        }
        return min;
    }
}
class Solution {
    public int findLength(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;
        int[][] dp = new int[m][n];
        int max = 0 ; 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr1[i]!=arr2[j]){
                    dp[i][j]=0;
                }
                else{
                    if(i==0 || j== 0){
                        dp[i][j]=1;
                    }
                    else{
                        dp[i][j]=1+dp[i-1][j-1];
                    }
                }
                max=Math.max(dp[i][j],max);
            }
        }
        return max ; 
    }
}
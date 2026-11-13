class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        return helper(m-1,n-1,nums1,nums2,dp);
    }
    public static int helper(int i,int j,int[] arr1,int[] arr2, int[][] dp){
        if(i==-1 || j==-1){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(arr1[i]==arr2[j]){
            return dp[i][j] =  1+helper(i-1,j-1,arr1,arr2,dp);
        }
        else{
            int a = helper(i,j-1,arr1,arr2,dp);
            int b = helper(i-1,j,arr1,arr2,dp);
            return dp[i][j] = Math.max(a,b);
        }
    }
}
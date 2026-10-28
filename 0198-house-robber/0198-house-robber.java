class Solution {
    static int[] dp;
    public static int helper(int idx , int[] arr){
        if(idx>=arr.length){
            return 0 ; //can steal 0 money
        }
        if(dp[idx]!=-1){
            return dp[idx];
        }
        int pick =arr[idx] +  helper(idx+2,arr);
        int skip = helper(idx+1,arr);
        int ans = Math.max(pick,skip);
        dp[idx]=ans;
        return ans;
    }
    public int rob(int[] arr) {
        dp = new int[arr.length];
        Arrays.fill(dp,-1);
        return helper(0,arr); // 0-> we start at the first house 
    }
}
class Solution {
    public int lengthOfLongestSubsequence(List<Integer> al, int target) {
        int[][] dp = new int[al.size()][target+1];
        for(int i=0;i<al.size();i++){
            for(int j=0;j<dp[0].length;j++){
                dp[i][j]=-1;
            }
        }
        int ans =  helper(0,al,target,dp);
        if(ans<0){
            return -1;
        }
        else{
            return ans ;
        }
    }
    public static int helper(int idx,List<Integer> al,int target,int[][] dp){
        if(idx==al.size()){
            if(target==0){
                return 0;
            }
            else{
                return Integer.MIN_VALUE;
            }
        }
        if(dp[idx][target]!=-1){
            return dp[idx][target];
        }
        int skip = helper(idx+1,al,target,dp);
        if(al.get(idx)>target){
            dp[idx][target]=skip;
            return skip;
        }
        int pick = 1 +  helper(idx+1,al,target-al.get(idx),dp);
        dp[idx][target] =  Math.max(skip,pick);
        return dp[idx][target];
    }
}
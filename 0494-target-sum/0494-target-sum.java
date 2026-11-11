class Solution {
    public int findTargetSumWays(int[] arr, int target) {
        return helper(0,arr,target);
    }
    public static int helper(int idx ,int[] arr,int target){
        if(idx==arr.length){
            if(target==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        int plus = helper(idx+1,arr,target-arr[idx]);
        int minus = helper(idx+1,arr,target+arr[idx]);
        return plus+minus;
    }
}
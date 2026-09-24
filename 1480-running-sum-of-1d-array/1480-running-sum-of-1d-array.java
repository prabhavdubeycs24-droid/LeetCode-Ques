class Solution {
    public int[] runningSum(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int i=0;i<n;i++){
            ans[i]= sum + arr[i];
            sum = ans[i];
        }
        return ans ;
    }
}
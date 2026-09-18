class Solution {
    public int maxSubArray(int[] arr) {
        int sum = 0;
        int i=0;
        int max = Integer.MIN_VALUE;
        while(i<arr.length){
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
            i++;
        }
        return max ; 
    }
}
class Solution {
    public int minMoves(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int count = 0 ; 
        for(int i=0;i<n;i++){
            count = count + (max-arr[i]);
        }
        return count;
    }
}
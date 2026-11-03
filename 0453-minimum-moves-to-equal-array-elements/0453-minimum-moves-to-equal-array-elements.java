class Solution {
    public int minMoves(int[] arr) {
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            min = Math.min(min,arr[i]);
        }
        int count = 0 ; 
        for(int i=0;i<n;i++){
            count=count+(arr[i]-min);
        }
        return count ; 
    }
}
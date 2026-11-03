class Solution {
    public int minMoves2(int[] arr) {
        int med = -1;
        Arrays.sort(arr);
        int n = arr.length;
        med = arr[n/2];
        int count = 0 ; 
        for(int i=0;i<n;i++){
            count = count + Math.abs(med-arr[i]);
        }
        return count ; 
    }
}
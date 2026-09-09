class Solution {
    public int maxScore(int[] arr, int k) {
        int left = 0;
        int right=0;
        for(int i =0;i<k;i++){
            left=left+arr[i];
        }
        int max = left ; 
        int i = arr.length-1;
        int j = k-1 ;
        while(j>=0){
            left = left - arr[j];
            right=right+arr[i];
            j--;
            i--;
            max = Math.max(max,left+right);
        }
        return max ;
    }
}
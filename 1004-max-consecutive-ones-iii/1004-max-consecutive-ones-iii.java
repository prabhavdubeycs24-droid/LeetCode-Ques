class Solution {
    public int longestOnes(int[] arr, int k) {
        int countzero = 0;
        int i=0;
        int j=0;
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        while(j<n){
            if(arr[j]==0){
                countzero++;
            }
            while(countzero>k){
                if(arr[i]==0){
                    countzero--;
                }
                i++;
            }
            j++;
            max=Math.max(max,j-i);
        }
        return max;
    }
}
class Solution {
    public int findMin(int[] arr) {
        int i =0;
        int j = arr.length-1;
        while(i<=j){
            if(arr[i]<=arr[j]){
                return arr[i];
            }
            int mid = (i+j)/2;
            if(arr[mid]>=arr[i]){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return -1;
    }
}
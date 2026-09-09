class Solution {
    public int findMin(int[] arr) {
        int i =0;
        int j =arr.length-1;
        while(i<j){
            int mid = (i+j)/2;
            if(arr[j]<arr[mid]){
                i=mid+1;
            }
            else if(arr[j]>arr[mid]){
                j=mid;
            }
            else{
                j--;
            }
        } 
        return arr[j];

    }
}
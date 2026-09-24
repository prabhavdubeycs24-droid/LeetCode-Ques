class Solution {
    public int searchInsert(int[] arr, int target) {
        if(target>arr[arr.length-1]){
            return arr.length;
        }
        if(target<arr[0]){
            return 0 ; 
        }
        int i =0;
        int j = arr.length-1;
        int mid =0; 
        while(i<=j){
            mid  = i + (j-i)/2 ;
            if(arr[mid]==target){
                return mid ;
            }
            else if(arr[mid]>target){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
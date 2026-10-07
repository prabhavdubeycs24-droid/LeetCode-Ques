class Solution {
    public int findMin(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        if(arr.length==2){
            return Math.min(arr[0],arr[1]);
        }
        int n = arr.length;
        int i=0;
        int j = arr.length-1;
        int mid = -1;
        while(i<j){
            mid = i+(j-i)/2;
            if(arr[i]<arr[j]){
                return arr[i];
            }
            if(arr[mid]>arr[j]){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return arr[i];
    }
}
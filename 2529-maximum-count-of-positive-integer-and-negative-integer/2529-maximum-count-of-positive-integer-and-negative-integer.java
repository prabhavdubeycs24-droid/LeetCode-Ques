class Solution {
    public int maximumCount(int[] arr) {
        int idx1=arr.length;
        int idx2 =-1;
        int n = arr.length ; 
        int i = 0;
        int j = n-1;
        //p
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]<=0){
                i=mid+1;
            }
            else{
                idx1=mid;
                j=mid-1;
            }
        }
        i=0;
        j=n-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]>=0){
                j=mid-1;
            }
            else{
                idx2=mid;
                i=mid+1;
            }
        }
        idx1 = arr.length-idx1;
        idx2=idx2+1;
        return Math.max(idx1,idx2);

    }
}
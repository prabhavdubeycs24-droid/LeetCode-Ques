class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n =arr2.length;
        int[] arr = new int[m+n];
        for(int i =0;i<m;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i]=arr2[i];
        }
        Arrays.sort(arr);
        if((n+m)%2==0){
            return (double)(arr[(n+m)/2]+arr[(n+m)/2 -1])/2;
        }
        else{
            return arr[(n+m)/2];
        }
    }
}
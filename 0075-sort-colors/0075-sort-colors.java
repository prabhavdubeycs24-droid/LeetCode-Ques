class Solution {
    public void sortColors(int[] arr) {
        int i = 0;
        int j = arr.length-1 ; 
        int mid = 0;
        while(mid<=j){
            if(arr[mid]==1){
                mid++;
            }
            else if(arr[mid]==2){
                int temp = arr[mid] ;
                arr[mid] = arr[j];
                arr[j]=temp ;
                j--;
            }
            else{
                int temp = arr[mid] ;
                arr[mid] = arr[i];
                arr[i]=temp;
                i++;
                mid++;
            }
        }
    }
}
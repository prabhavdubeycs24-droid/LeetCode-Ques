// entire , till k-1 , from k-1 to end 
class Solution {
    public void rotate(int[] arr, int k) {
        int n = arr.length;
        k=k%n;
        if(arr.length==1){
            return;
        }
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i = 0;
        j = k-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        i = k;
        j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}
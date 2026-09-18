//from right side find ele arr[i]<arr[i+1]
//then sawp it with the smallest in the right side GREATER THAN arr[i]
// reverse everything after i(as after swapping we need to make everything smallest after that) for step 1 , right would already be in descending order , therefore sort 
class Solution {
    public void nextPermutation(int[] arr) {
        if(arr.length==1){
            return ; 
        }
        int n = arr.length;
        int ele =0; 
        int idx = -1;
        for(int i=n-1;i>=0;i--){
            if(i!=0 && arr[i-1]<arr[i]){
                ele = arr[i-1];
                idx = i-1;
                break;
            }
        }
        if(idx==-1){
            int j=0, k=n-1;

            while(j<k){
                int temp=arr[j];
                arr[j]=arr[k];
                arr[k]=temp;
                j++;
                k--;
            }

            return;
        }
        int j =n-1;
        while(j>=idx){
            if(arr[j]>ele){
                int temp = arr[idx] ;
                arr[idx] = arr[j];
                arr[j]=temp;

                break ; 
            }
            j--;
        }
        j= idx+1;
        int k=n-1;
        while(j<k){
            int temp = arr[j];
            arr[j]=arr[k];
            arr[k]=temp ;

            j++;
            k--;
        }


    }
}
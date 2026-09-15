class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        
        if(arr.length==2){
            if(arr[1]==1 && arr[0]==1){
                return 2 ;
            }
        }
        if(arr.length==2){
            if(arr[1]==1){
                return 1 ;
            }
        }
        
        int n = arr.length;
        int max =0;
        int i=0;
        while(i<n-1){
            if(arr[i]==1){
            int count =1;
            while(i<n-1 && arr[i]==1 && arr[i+1]==1){
                count++;
                i++;
            }
            if(count>max){
                    max=count;
                }
            }
            i++;
        }
        return max;
    }
}
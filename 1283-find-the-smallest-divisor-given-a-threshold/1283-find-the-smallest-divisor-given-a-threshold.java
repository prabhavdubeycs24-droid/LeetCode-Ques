class Solution {
    public int smallestDivisor(int[] arr, int t) {
        int max = 0 ; 
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
        }
        int i = 1;
        int j = max ; 
        while(i<j){
            int mid = (j-i)/2 + i;
            int div = 0 ; 
            for(int idx=0;idx<arr.length;idx++){
                if(arr[idx]%mid==0){
                    div=div+(arr[idx]/mid);
                }
                else{
                    div=div+((arr[idx]+mid-1)/mid);
                }
            }
            if(div>t){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return i ;
    }
}
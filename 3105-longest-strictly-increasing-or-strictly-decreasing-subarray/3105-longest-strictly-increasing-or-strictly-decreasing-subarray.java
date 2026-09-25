class Solution {
    public int longestMonotonicSubarray(int[] arr) {
        int n = arr.length;
        int max = 1 ;
        for(int i=0;i<n;i++){
            int count1 =1;
            int count2 =1;
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[j-1]){
                    count1++;
                }
                else{
                    break;
                }
            }
            for(int k=i+1;k<n;k++){
                if(arr[k]<arr[k-1]){
                    count2++;
                }
                else{
                    break;
                }
            }    
            max = Math.max(max,Math.max(count1,count2));
            
        }
        return max ; 
    }
}
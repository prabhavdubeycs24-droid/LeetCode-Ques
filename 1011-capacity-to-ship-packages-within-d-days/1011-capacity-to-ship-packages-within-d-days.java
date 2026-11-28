class Solution {
    public int shipWithinDays(int[] arr, int days) {
        int max = Integer.MIN_VALUE;
        int total = 0 ; 
        for(int i=0;i<arr.length;i++){
            max=Math.max(max,arr[i]);
            total=total+arr[i];
        }
        int idx = 0 ;
        int i = max;
        int j = total ;
        int ans =-1;
        while(i<j){
            int mid = ((j-i)/2) + i;
            int sum = 0;
            int count = 0 ; 
            while(idx<arr.length){
                while(idx<arr.length && sum+arr[idx]<=mid){
                    sum =sum+arr[idx];
                    idx++;
                }
                sum=0;
                count++;
            }
            idx=0;
            if(count>days){
                i=mid+1;
            }
            else{
                j=mid;
            }
            count = 0 ; 
        }
        return j; 
    }
}
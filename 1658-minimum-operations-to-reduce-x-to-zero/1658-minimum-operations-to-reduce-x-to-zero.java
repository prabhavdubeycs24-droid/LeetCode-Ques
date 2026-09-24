class Solution {
    public int minOperations(int[] arr, int x) {
        long sum =0;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        long req = sum-x;
        if(req==0){
            return arr.length;
        }
        if(req<0){
            return -1;
        }
        long max = Long.MIN_VALUE;
        int j=0;
        int k=0;
        long reqsum=0;
        while(k<arr.length){
            reqsum=reqsum+arr[k];
            
            while(reqsum>req){
                reqsum=reqsum-arr[j];
                j++;
            }
            if(reqsum==req){
                max=Math.max(max,k-j+1);
            }
            k++;
        }
        if(max==Long.MIN_VALUE){
            return -1;
        }
        return arr.length-(int)max;
    }
}
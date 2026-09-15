class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum=sum+arr[i];
        }
        int i =1;
        int j = k-i+1;
        int max = sum;
        while(j<arr.length){
            sum=sum-arr[i-1]+arr[j];
            if(sum>max){
                max=sum;
            }
            i++;
            j++;
        }
        return (double)max/k;
    }
}
class Solution {
    public int totalHammingDistance(int[] arr) {
        int sum = 0; 
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum=sum+Integer.bitCount(arr[i]^arr[j]);
            }
        }
        return sum;
    }
}
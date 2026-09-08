class Solution {
    public int singleNumber(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int i =0;
        while(i<=arr.length-2){
            if(arr[i]==arr[i+1]){
                i=i+2;
            }
            else{
                return arr[i];
            }
        }
        return arr[n-1];
    }
}
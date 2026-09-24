class Solution {
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i =0;
        int j =arr.length-1;
        int l = n-1 ;
        while(l>=0){
            int a = arr[j]*arr[j];
            int b = arr[i]*arr[i];
            if(a>=b){
                ans[l]=a;
                j--;
                l--;
            }
            else{
                ans[l]=b;
                i++;
                l--;
            }
        }
        return ans ; 
    }
}
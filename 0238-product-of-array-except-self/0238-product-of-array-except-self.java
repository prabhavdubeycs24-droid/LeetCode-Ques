class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        left[0]=1;
        int lprod=1;
        for(int i =0;i<arr.length-1;i++){
            lprod=lprod*arr[i];
            left[i+1]=lprod;
            
        }
        right[arr.length-1]=1;
        int rprod=1;
        for(int i=arr.length-1;i>0;i--){
            rprod=rprod*arr[i];
            right[i-1]=rprod;
            
            
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=left[i]*right[i];
        }
        return ans;
    }
}
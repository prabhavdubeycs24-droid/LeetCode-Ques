class Solution {
    public int[] productExceptSelf(int[] arr) {
        int[] ans=new int[arr.length];
        ans[0]=1;
        int lprod=1;
        for(int i=0;i<arr.length-1;i++){
            lprod=lprod*arr[i];
            ans[i+1]=lprod;
            
        }
        int rprod=1;
        for(int i=arr.length-1;i>0;i--){
            rprod=rprod*arr[i];
            ans[i-1]=ans[i-1]*rprod;
            
        }
        return ans;
        
    }
}
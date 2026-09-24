class Solution {
    public static void helper(int[] arr , int[] ans){
        for(int i=0;i<arr.length;i++){
            ans[i]=arr[i]*arr[i];
        }
    }
    public int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int i=0;
        int j=0;
        if(arr[0]>=0){
            helper(arr,ans);
            return ans;
        }
        if(arr[0]<0 && arr[n-1]<=0){
            helper(arr,ans);
            int x = 0;
            int y = n-1;
            while(x<y){
                int temp = ans[x];
                ans[x]=ans[y];
                ans[y]=temp;
            }
            return ans ;
        }
        else{
            helper(arr,ans);
            Arrays.sort(ans);
            return ans ; 
        }
    }
}
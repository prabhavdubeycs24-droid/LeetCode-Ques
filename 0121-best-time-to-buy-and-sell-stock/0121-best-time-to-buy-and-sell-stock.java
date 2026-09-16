class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int max = 0;
        int i=0;
        int j=1;
        while(j<n){
            if(arr[i]<arr[j]){
                max=Math.max(max,arr[j]-arr[i]);
                j++;
                
            }
            else{
                i=j;
                j++;
            }
        }
        return max ; 
    }
}
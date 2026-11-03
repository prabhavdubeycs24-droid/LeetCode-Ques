class Solution {
    public static boolean allMax(int[] arr , int max){
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max){
                return true;
            }
        }
        return false;
    }
    public int minMoves(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            max=Math.max(max,arr[i]);
        }
        int count=0 ; 
        int i=0;
        while(allMax(arr,max) && i<n){
            if(arr[i]==max){
                i++;
            }
            else{
                arr[i]=arr[i]+1;
                count++;
            }
            
        }
        return count ; 
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int i = 0;
        int j = 0;
        int n = arr.length;
        int max = 0;
        int count=0;
        while(j<n){
            if(arr[j]==1){
                count++;
                j++;
            }
            else{
                max=Math.max(count,max);
                count=0;
                i=j;
                j++;
            }
            
        }
        max=Math.max(count,max);
        return max ; 
    }
}
class Solution {
    public int longestOnes(int[] arr, int k) {
        int n = arr.length;
        int i =0;
        int j =0;
        int countzero=0;
        int max = 0;
        while(j<n){
            if(arr[j]==0){
                countzero++;
            }
            if(countzero<=k){
                max=Math.max(max,j-i+1);

            }
            else{
                
                if(arr[i]==0){
                    countzero--;
                }
                i++;
            }
            j++;
        }
        return max ; 
    }
}
class Solution {
    public int missingNumber(int[] arr) {
        int exp = 0 ; 
        int n = arr.length;
        for(int i=1;i<=n;i++){
            exp=exp^i;
        }
        int act = 0 ; 
        for(int i=0;i<n;i++){
            act = act^arr[i];
        }
        return exp^act;
    }
}
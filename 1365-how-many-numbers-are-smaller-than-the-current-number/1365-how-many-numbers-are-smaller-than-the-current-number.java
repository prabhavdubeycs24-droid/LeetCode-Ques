class Solution {
    public int[] smallerNumbersThanCurrent(int[] arr) {
        int[] freq = new int[110];
        for(int i=0;i<arr.length;i++){
            freq[arr[i]]++;
        }
        int[] smaller = new int[freq.length];
        int count = 0;
        for(int i=0;i<freq.length;i++){
            smaller[i]=count;
            count = count + freq[i];
        }
        int[] ans = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=smaller[arr[i]];
        }
        return ans ; 
    }
}
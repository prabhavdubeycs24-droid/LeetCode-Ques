class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int i=0;i<piles.length;i++){
            max = Math.max(max,piles[i]);
        }
        int i=1;
        int j= max;
        long output = -1;
        while(i<=j){
            int mid = i+(j-i)/2;
            long ans = 0;
            for(int k=0;k<piles.length;k++){
                ans = ans+ (long)(piles[k]+(mid-1))/mid; //ceil division
            }
            if(ans<=h){
                j=mid-1;
                output = mid;
            }
            else{
                i=mid+1;
            }
        }
        return (int)output;
    }
}
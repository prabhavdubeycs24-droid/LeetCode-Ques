class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int n = piles.length;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int i =1;
        int j = max ;
        while(i<=j){
            int mid = (i+j)/2;
            long ans=0;
            for(int k=0;k<piles.length;k++){
                ans = ans+ (long)(piles[k]+mid-1)/mid;
            }
            if(ans<=h){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return i;
    }
}
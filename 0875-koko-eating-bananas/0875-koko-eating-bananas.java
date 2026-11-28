class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0 ;
        for(int i=0;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int i = 1;
        int j = max;
        while(i<j){
            int mid = (j-i)/2 + i;
            int hour = 0;
            for(int idx=0;idx<piles.length;idx++){
                if(piles[idx]<mid){
                    hour++;
                }
                else{
                    hour = hour + ((piles[idx]+(mid-1))/mid);  //ceil divison 
                }
            }
            if(hour>h){
                i=mid+1;
            }
            else{
                j=mid;
            }
        }
        return j ; 
    }
}
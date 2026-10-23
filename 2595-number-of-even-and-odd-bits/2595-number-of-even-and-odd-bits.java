class Solution {
    public int[] evenOddBit(int n) {
        int even = 0;
        int odd = 0 ;
        int i = 0 ;
        while(n!=0){
            if((n&1)!=0){
                if(i%2==0) even++;
                else odd++;
            }
            i++;
            n=n>>1;
        }
        return new int[]{even,odd}; 
    }
}
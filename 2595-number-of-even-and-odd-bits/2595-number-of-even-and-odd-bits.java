class Solution {
    public int[] evenOddBit(int n) {
        int[] ans = new int[2]; // 1st even , 2nd odd 
        int even = 0;
        int odd = 0 ;
        int i = 0 ;
        while(n!=0){
            if(n%2!=0){
                if(i%2==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
            i++;
            n=n>>1;
        }
        ans[0]=even;
        ans[1]=odd;
        return ans ; 
    }
}
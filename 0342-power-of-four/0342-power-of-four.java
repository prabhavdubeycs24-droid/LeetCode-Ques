class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
       int pos = -1;
       int i = 0 ;
       int count = 0;
       while(n!=0){
        if(n%2!=0){
            count++;
            pos = i ; 
        }
        n=n>>1;
        i++;
       }
       if(count==1 && pos%2==0){
        return true;
       }
       return false;
    }
}
class Solution {
    public boolean hasAlternatingBits(int n) {
        int signal = 0 ; 
        while(n!=0){
            if(n%2==0){
                n=n>>1;
                if(n%2==0){
                    return false;
                }
            }
            else{
                n=n>>1;
                if(n%2!=0){
                    return false;
                }
            }
        }
        return true; 
    }
}
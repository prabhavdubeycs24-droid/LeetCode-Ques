class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        boolean flag1 = false;
        boolean flag2 = false;
        int x = (int)Math.sqrt(n);
        if(x*x==n){
            flag1 = true;
        }
        if((n&(n-1))==0){
            flag2  = true;
        }
        if(flag1 && flag2){
            return true;
        }
        return false;

    }
}
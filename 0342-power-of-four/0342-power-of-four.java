class Solution {
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        boolean f1 = false;
        boolean f2 = false;
        double a = Math.sqrt(n);
        if(a*a==n){
            f1=true;
        }
        if((n & (n-1)) == 0){
            f2 = true;
        }
        if( f1&&f2) return true;
        return false;
    }
}
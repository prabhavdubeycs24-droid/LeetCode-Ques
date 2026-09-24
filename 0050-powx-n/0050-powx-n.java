class Solution {
    public double myPow(double x, int n) {
        long N = Math.abs((long)n);
       if(N==0){
        return 1 ;
       }
      double ans = myPow(x, (int)(N / 2));
       if(N%2==0){
        ans= ans*ans;
       }
       else if((N)%2!=0){
        ans= x*ans*ans;
       }
       if(n>=0){
        return ans ;
       }
       return 1/ans;
    }   
}

class Solution {
    public static double helper1(double x , long n){
        if(n==1){
            return x;
        }
        double q = helper1(x,n/2);
        if(n%2==0){
            return  q*q;
        }
        else{
            return x*q*q;
        }
    }
    public double myPow(double x, int n) {
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
        long p = n ;
        if(p>0){
            return helper1(x,n);
        }
        else{
            p=-p;
            double ans =  helper1(x,p);
            return 1/ans;
        }
    }
}
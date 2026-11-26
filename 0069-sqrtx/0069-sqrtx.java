class Solution {
    public int mySqrt(int x) {
        if(x==0){
            return 0;
        }
        long i = 1 ;
        long j = x;
        long idx = -1;
        while(i<=j){
            long mid = (j-i)/2 + i;
            if(mid*mid>x){
                j=mid-1;
            }
            else if(mid*mid==x){
                return (int)mid;
            }
            else{
                i=mid+1;
                idx = mid ;
            }
        }
        int ans = (int)idx;
        return ans; 
    }
}
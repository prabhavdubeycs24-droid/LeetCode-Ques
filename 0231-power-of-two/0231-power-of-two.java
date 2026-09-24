class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        if(n==0){
            return false;
        }
        int i =0;
        int j = 30;
        while(i<=j){
            int mid = i+ (j-i)/2;
            if(Math.pow(2,mid)==n){
                return true;
            }
            else if(Math.pow(2,mid)>n){
                j=mid-1;
            }
            else{
                i=mid+1;
            }
        }
        return false;
    }
}
class Solution {
    public int reverse(int x) {
        long  ans=0;
        while(x!=0){
            int pop = (int)x%10;
            ans = ans*10+pop;
            x=x/10;
        }
        if(ans<=Integer.MIN_VALUE || ans>=Integer.MAX_VALUE){
            return 0 ; 
        }
        return (int)ans ; 
    }
}
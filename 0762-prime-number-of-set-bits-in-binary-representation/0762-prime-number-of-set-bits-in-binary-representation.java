class Solution {
    public static boolean isprime(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for(int i=left;i<=right;i++){
            int x = Integer.bitCount(i);
            if(isprime(x)){
                count++;
            }
        }
        return count ; 
    }
}
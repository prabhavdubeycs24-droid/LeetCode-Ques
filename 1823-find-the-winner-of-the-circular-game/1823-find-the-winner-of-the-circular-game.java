class Solution {
    public int findTheWinner(int n, int k) {
        if(n==1){
            return 1 ; 
        }
       int ans = (findTheWinner(n-1,k)+k)%n;
       if(ans==0){// as it is 1 based indexing ans==0 points to the nth node 
        return n ;
       }
       else{
        return ans ;
       }

    }
}
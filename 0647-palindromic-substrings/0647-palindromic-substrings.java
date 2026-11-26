class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int count = 0 ; 
        for(int i=0;i<n;i++){
            int r = 0 ; 
            int c = i ;
            while(r<n && c<n){
                if(r==c){
                    dp[r][c]=1;
                }
                else if(s.charAt(r)==s.charAt(c)){
                    if(c-1==r){
                        dp[r][c]=2;
                    }
                    else if(dp[r+1][c-1]!=0){
                        dp[r][c]=dp[r+1][c-1]+2;
                    }
                }
                if(dp[r][c]>=1){
                    count++;
                }
                r++;
                c++;
            }
        }
        return count ; 
    }
}
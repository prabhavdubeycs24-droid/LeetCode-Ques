class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int[][] dp = new int[n][n];
        int max = 1;
        for(int i=0;i<n;i++){
            int r = 0;
            int c = i;
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
                max=Math.max(max,dp[r][c]);
                r++;
                c++;
                
            }
        }
        int a = -1;
        int b = -1;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<n;j++){
                if(dp[i][j]==max){
                    flag=true;
                    a=i;
                    b=j;
                    break;
                }
            }
            if(flag) break;
        }
        return s.substring(a,b+1);
    }
}
class Solution {
    public String shortestCommonSupersequence(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];
        // by default 0 value hogi 
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        int LCS = dp[m][n];
        int p = m;
        int q = n;
        StringBuilder sb = new StringBuilder();
        while(p!=0 && q!=0){
            if(s1.charAt(p-1)==s2.charAt(q-1)){
                sb.append(s1.charAt(p-1));
                p--;
                q--;
            }
            else{
                if(dp[p-1][q]>dp[p][q-1]){
                    p--;
                }
                else{
                    q--;
                }
            }
        }
        String s = sb.reverse().toString();
        int i=0; // s1
        int j=0; //s2
        int k =0; //s , LCS 
        StringBuilder ans = new StringBuilder();
        while(k<s.length()){
            if(s1.charAt(i)==s2.charAt(j) && s2.charAt(j)==s.charAt(k)){
                ans.append(s1.charAt(i));
                i++;
                j++;
                k++;
            }
            else{
                while(s1.charAt(i)!=s.charAt(k)){
                    ans.append(s1.charAt(i));
                    i++;
                }
                while(s2.charAt(j)!=s.charAt(k)){
                    ans.append(s2.charAt(j));
                    j++;
                }
            }
        }
        while(i<s1.length()){
            ans.append(s1.charAt(i));
            i++;
        }
        while(j<s2.length()){
            ans.append(s2.charAt(j));
            j++;
        }
        return ans.toString();
    }
}
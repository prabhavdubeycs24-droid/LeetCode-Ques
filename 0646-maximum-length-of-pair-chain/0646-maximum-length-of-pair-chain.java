class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,(a,b)->Integer.compare(a[0],b[0]));
        int[] dp = new int[pairs.length];
        dp[0]=1;
        int tru_max=1;
        for(int i=0;i<pairs.length;i++){
            int max = 0;
            for(int j=i;j>=0;j--){
                if(pairs[i][0]>pairs[j][1]){
                    max=Math.max(max,dp[j]);
                }
            }
            dp[i]=max+1;
            tru_max=Math.max(tru_max,dp[i]);
        }
        return tru_max;
    }
}
class Solution {
    static int[] dp1 ;
    static  int[] dp2 ; 
    public static int helper1(int idx , int[] arr){
        if(idx>=arr.length){
            return 0 ; 
        }
        if(dp1[idx-1]!=-1){
            return dp1[idx-1];
        }
        int pick = arr[idx]+helper1(idx+2,arr);
        int skip = helper1(idx+1,arr);
        int ans = Math.max(pick,skip);
        dp1[idx-1]=ans;
        return ans ; 
    }
    public static int helper2(int idx , int[] arr){
        if(idx>=arr.length-1){
            return 0 ; 
        }
        if(dp2[idx]!=-1){
            return dp2[idx];
        }
        int pick = arr[idx]+helper2(idx+2,arr);
        int skip = helper2(idx+1,arr);
        int ans = Math.max(pick,skip);
        dp2[idx]=ans;
        return ans;
    }
    public int rob(int[] arr) {
        int n = arr.length;
        if(n==1){
            return arr[0];
        }
        dp1 = new int[n-1];
        dp2 = new int[n-1];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(helper1(1,arr),helper2(0,arr));
    }
}
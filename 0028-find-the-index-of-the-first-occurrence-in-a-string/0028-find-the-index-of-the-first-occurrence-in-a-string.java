class Solution {
    public int strStr(String h, String n1) {
        int n = h.length();
        int m = n1.length();
        for(int i=0;i<=n-m;i++){
            int count=0;
            for(int j=0;j<m;j++){
                if(h.charAt(i+j)==n1.charAt(j)){
                    count++;
                }
                if(count==m){
                    return i; 
                }
            }
        }
        return -1;
    }
}
class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        StringBuilder sb1 = new StringBuilder(m);
        for(int i=0;i<n;i++){
            sb1.append(".");
        }
        StringBuilder sb2 = new StringBuilder(m);
        for(int i=0;i<n-1;i++){
            sb2.append("#");
        }
        sb2.append(".");
        ans[0]=sb1.toString();
        for(int i=1;i<m;i++){
            ans[i]=sb2.toString();
        }
        return ans ; 
    }
}
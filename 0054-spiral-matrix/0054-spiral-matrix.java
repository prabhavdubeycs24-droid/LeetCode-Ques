class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        int a = mat.length;
        int b = mat[0].length;
        int fr = 0;
        int fc = 0;
        int lr = a-1;
        int lc =b-1;
        ArrayList<Integer> al = new ArrayList<>();
        // i -> row , j-> col 
        while(fr<=lr && fc<=lc){
            for(int j=fc;j<=lc;j++){
                al.add(mat[fr][j]);
            }
            fr++;
            if(fr>lr || fc>lc){
                break;
            }
            
            for(int i=fr;i<=lr;i++){
                al.add(mat[i][lc]);
            }
            lc--;
            if(fr>lr || fc>lc){
                break;
            }
            for(int j=lc;j>=fc;j--){
                al.add(mat[lr][j]);
            }
            lr--;
            if(fr>lr || fc>lc){
                break;
            }
            for(int i=lr;i>=fr;i--){
                al.add(mat[i][fc]);
            }
            fc++;
        }
        return al ;
    }
}
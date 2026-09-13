class Solution {
    public int diagonalSum(int[][] mat) {
        int a = mat.length;
        int b = mat[0].length;
        int sum=0;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i==j){
                    sum=sum+mat[i][j];
                }
                if(i+j==a-1){
                    sum=sum+mat[i][j];
                }
            }
        }
        if(a%2!=0){
            return sum-mat[a/2][b/2];
        }
        return sum ;
    }
}
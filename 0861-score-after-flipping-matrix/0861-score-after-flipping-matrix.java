//flip row if -> start with 0 
// flip col if -> 0 count  jyada ho 1 ke count se
class Solution {
    public int matrixScore(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        // for row flip 
        for(int i=0;i<m;i++){
            if(grid[i][0]==0){
                for(int j = 0;j<grid[i].length;j++){
                    if(grid[i][j]==0){
                        grid[i][j]=1;
                    }
                    else{
                        grid[i][j]=0;
                    }
                }
            }
        }
        // col flip 
        for(int i=0;i<n;i++){
            int countOne = 0 ;
            int countZero = 0;
            for(int j=0;j<m;j++){
                if(grid[j][i]==0){
                    countZero++;
                }
                else{
                    countOne++;
                }
            }
            if(countZero>countOne){
                for(int k =0;k<m;k++){
                    if(grid[k][i]==1){
                        grid[k][i]=0;
                    }
                    else{
                        grid[k][i]=1;
                    }
                }
            }
        }
        int sum = 0 ; 
        for(int i=0;i<m;i++){
            int val = 0 ;  
            int x = 0 ;  
            for(int j=n-1;j>=0;j--){
                if(grid[i][j]==1){
                    val=val+(int)Math.pow(2,x);
                }
                x++;
            }
            sum = sum + val; 
        }
        return sum ; 
    }
}
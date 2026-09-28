class triplet implements Comparable<triplet>{
    int ele ;
    int row ;
    int col ;
    triplet(int ele , int row , int col){
        this.ele=ele;
        this.row=row;
        this.col=col;
    }
    public int compareTo(triplet t){
        return Integer.compare(this.ele,t.ele);
    }
}
class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++){
            triplet t = new triplet(matrix[i][0],i,0);
            pq.add(t);
        }
        for(int i=0;i<k-1;i++){
            triplet tr=pq.remove();
            int nextcol = tr.col+1;
            int row = tr.row;
            if(nextcol<matrix[0].length){
                pq.add(new triplet(matrix[row][nextcol],row,nextcol));
            }
    
        }
        return pq.peek().ele;
    }
}
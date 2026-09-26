class triplet implements Comparable<triplet>{
    int x ;
    int y;
    int dist;
    triplet(int x,int y,int dist){
        this.x=x;
        this.y=y;
        this.dist=dist;
    }
    public int compareTo(triplet t){
        return Double.compare(t.dist , this.dist);
    }
}
class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int n = points.length;
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int d = ((points[i][0]*points[i][0])+(points[i][1]*points[i][1]));
            pq.add(new triplet(points[i][0],points[i][1],d));
        }
        while(pq.size()>k){
            pq.remove();
        }
        int[][] ans  = new int[k][2];
        int j=0;
        while(pq.size()!=0){
            ans[j][0]=pq.peek().x;
            ans[j][1]=pq.peek().y;
            pq.remove();
            j++;
        }
        return ans ; 
    }
}
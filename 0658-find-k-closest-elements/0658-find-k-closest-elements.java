public class pair implements Comparable<pair>{
    int ele ;
    int dist ;
    pair(int ele , int dist){
        this.ele=ele;
        this.dist=dist;
    }
    public int compareTo(pair p){ // descending
        if(p.dist==this.dist){
            return Integer.compare(p.ele,this.ele);
        }
        return Integer.compare(p.dist,this.dist);
    }

}
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int n = arr.length;
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            pq.add(new pair(arr[i],Math.abs(arr[i]-x)));
        }
        while(pq.size()>k){
            pq.remove();
        }
        PriorityQueue<Integer> pq1 = new PriorityQueue<>();
        while(pq.size()!=0){
            pq1.add(pq.peek().ele);
            pq.remove();
        }
        ArrayList<Integer> al = new ArrayList<>();
        while(pq1.size()!=0){
            al.add(pq1.remove());
        }
        
        return al ;
    }
}
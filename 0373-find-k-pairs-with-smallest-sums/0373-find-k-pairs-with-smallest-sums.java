class triplet implements Comparable<triplet>{
    int sum;
    int i;
    int j;
    triplet(int sum,int i,int j){
        this.sum=sum;
        this.i=i;
        this.j=j;
    }
    public int compareTo(triplet t){
        return Integer.compare(this.sum,t.sum);
    }
}
class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            pq.add(new triplet(nums1[i]+nums2[0],i,0));
        }
        while(ans.size()<k  && pq.size() != 0){
            ArrayList<Integer> al = new ArrayList<>();
            triplet tr = pq.remove();
            int nextcol = tr.j+1;
            al.add(nums1[tr.i]);
            al.add(nums2[tr.j]);
            ans.add(new ArrayList<>(al));
            if(nextcol<nums2.length){
                pq.add(new triplet(nums1[tr.i]+nums2[tr.j+1],tr.i,tr.j+1));
            }
            
        }
        return ans ; 
    }
}
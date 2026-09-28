class triplet implements Comparable<triplet>{
    int ele ;
    int row ;
    int col;
    triplet(int ele,int row,int col){
        this.ele=ele;
        this.row=row;
        this.col=col;
    }
    public int compareTo(triplet t){
        return Integer.compare(this.ele,t.ele);
    }
}
class Solution {
    public int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<triplet> pq = new PriorityQueue<>();
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.size();i++){
            triplet t = new triplet(nums.get(i).get(0), i, 0);
            max = Math.max(nums.get(i).get(0),max);
            pq.add(t);
        }
        int ansmin = Integer.MAX_VALUE;
        int ansmax = Integer.MIN_VALUE;
        int range = Integer.MAX_VALUE;
        while(true){
            triplet t  = pq.remove();
            int min = t.ele;
            if(max-min<range){
                range = max - min ;
                ansmin=min;
                ansmax=max;
            }
            int nextcol = t.col+1;
            if(nextcol==nums.get(t.row).size()){
                break;
            }
            int nextele = nums.get(t.row).get(nextcol);
            pq.add(new triplet(nums.get(t.row).get(nextcol),t.row,nextcol));
            max = Math.max(max,nextele);
        }
        return new int[]{ansmin,ansmax};
    }
}
class Solution {
    public int lastStoneWeight(int[] arr) {
        int n = arr.length;
        int k = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>=2){
            int x = pq.remove();
            int y = pq.remove();
            if(x>y){
                pq.add(x-y);
            }
        }
        if(pq.size()==0){
            return 0 ; 
        }
        return pq.peek();
    }
}
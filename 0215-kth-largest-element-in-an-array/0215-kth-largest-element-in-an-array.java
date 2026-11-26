class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>();
       for(int ele : arr){
        pq.add(ele);
       }
       int x = 0; 
       while(x!=arr.length-k){
        pq.remove();
        x++;
       }
       return pq.peek();

    }
}
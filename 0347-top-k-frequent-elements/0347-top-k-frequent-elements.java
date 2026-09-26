class pair implements Comparable<pair>{
    int ele ;
    int freq;
    pair(int ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }
    public int compareTo(pair p){
        return Integer.compare(this.freq,p.freq);
    }
}
class Solution {
    public int[] topKFrequent(int[] arr, int k) {
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele : arr){
            map.put(ele,map.getOrDefault(ele,0)+1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>();
        for(int ele : map.keySet()){
            int freq = map.get(ele);
            pq.add(new pair(ele,freq));
        }
        while(pq.size()>k){
            pq.remove();
        }
        int[] ans = new int[k];
        int x =0;
        while(pq.size()!=0){
            ans[x]=pq.peek().ele;
            pq.remove();
            x++;
        }
        return ans ;

    }
}
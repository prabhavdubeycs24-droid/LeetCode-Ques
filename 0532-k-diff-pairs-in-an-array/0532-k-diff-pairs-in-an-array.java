class Solution {
    public int findPairs(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int freq = map.get(arr[i]);
                map.put(arr[i],freq+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int count = 0;
        if(k==0){
            for(int ele:map.keySet()){
                if(map.get(ele)>=2){
                    count++;
                }
            }
            return count ; 
        }
        
        for(int ele:map.keySet()){
            int need2 = k+ele;
            if(map.containsKey(need2)){
                count++;
            }
        }
        return count;
    }
}
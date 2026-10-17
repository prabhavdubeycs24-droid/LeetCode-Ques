class Solution {
    public int majorityElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int f = map.get(arr[i]);
                map.put(arr[i],f+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int max = 0;
        int key = Integer.MAX_VALUE;
        for(int ele : map.keySet()){
            if(map.get(ele)>max){
                max=map.get(ele);
                key = ele;
            }
        }
        return key; 
    }
}
class Solution {
    public int numPairsDivisibleBy60(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<arr.length;i++){
            int x = arr[i]%60;
            if(map.containsKey(x)){
                int f = map.get(x);
                map.put(x,f+1);
            }
            else{
                map.put(x,1);
            }
        }
        long pair = 0;
        // for remainder ==0 case ->>
        if(map.containsKey(0)){
            int countZero = map.get(0);
        pair = pair+ (long)countZero * (countZero-1);
        map.remove(0);
        }
        // when k is even case and remainder k/2 is present ->>
        if(60%2==0 && map.containsKey(60/2)){//k%2 is imp as division in java is floored
            int countKhalf = map.get(60/2);
        pair = pair + (long)countKhalf * (countKhalf-1);
        map.remove(60/2);
        }
        //normal case ->>
        for(int ele:map.keySet()){
            if(map.containsKey(60-ele)){
                long x = map.get(ele);
                long y =map.get(60-ele);
                pair=pair+(x*y);
            }
        }
        return (int)(pair/2);
    }
}
class Solution {
    public int subarraySum(int[] arr, int k) {
        int n = arr.length;
        int[] ps = new int[n];
        int sum = 0 ; 
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            ps[i]=sum ; 
        }
        HashMap<Integer,Integer> map = new HashMap();
        int count = 0 ; 
        for(int i=0;i<n;i++){
            if(ps[i]==k){
                count++;
            }
            if(map.containsKey(ps[i]-k)){
                count = count + map.get(ps[i]-k);
            }
            if(map.containsKey(ps[i])){
                int f = map.get(ps[i]);
                map.put(ps[i],f+1);
            }
            else{
                map.put(ps[i],1);
            }
        }
        return count ; 
    }
}
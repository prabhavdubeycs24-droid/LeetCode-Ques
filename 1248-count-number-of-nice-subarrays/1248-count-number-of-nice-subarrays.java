class Solution {
    public int numberOfSubarrays(int[] arr, int k) {
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                arr[i]=0;
            }
            else{
                arr[i]=1;
            }
        }
        int[] ps = new int[n];
        int sum = 0 ; 
        for(int i=0;i<n;i++){
            sum = sum + arr[i];
            ps[i]=sum;
        }
        // now count subarray with sum == k (reduced to LC 560)
        HashMap<Integer,Integer> map = new HashMap<>();
        int count = 0 ; 
        for(int i=0;i<n;i++){
            if(ps[i]==k){
                count++;
            }
            if(map.containsKey(ps[i]-k)){
                count=count+map.get(ps[i]-k);
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
class Solution {
    public int findMaxLength(int[] arr) {
        int n = arr.length;
        int[] ps = new int[n];
        int sum = 0 ; 
        for(int i=0;i<n;i++){
            int x = 1 ; 
            if(arr[i]==0){
                x=-1;
            }
            sum = sum + x ;
            ps[i]=sum; 
        }
        int[] ps1 = new int[n];
        sum=0;
        for(int i=0;i<n;i++){
            sum=sum+ps[i];
            ps1[i]=sum;
        }
        int max =0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<n;i++){
            if(ps[i]==0){
                max=Math.max(max,i+1);
            }
            if(map.containsKey(ps[i])){
                max=Math.max(max,i-map.get(ps[i]));
            }
            if(!map.containsKey(ps[i])){
                map.put(ps[i],i);
            }
        }
        return max ;
    }
     
}
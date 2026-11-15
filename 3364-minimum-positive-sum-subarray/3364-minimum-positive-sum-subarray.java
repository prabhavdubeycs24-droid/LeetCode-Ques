class Solution {
    public int minimumSumSubarray(List<Integer> al, int l, int r) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<al.size();i++){
            int sum=0;
            int size=0;
            for(int j=i;j<al.size();j++){
                sum=sum+al.get(j);
                size++;
                if(size>=l && size<=r && sum>0){
                    min=Math.min(min,sum);
                }
            }
        }
        if(min==Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }
}
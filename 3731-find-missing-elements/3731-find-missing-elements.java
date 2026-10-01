class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        HashSet<Integer> set = new HashSet<>();
        for(int ele:arr){
            max = Math.max(max,ele);
            min=Math.min(min,ele);
            set.add(ele);
        }
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(set.contains(i)){
                continue;
            }
            else{
                al.add(i);
            }
        }
        return al ;
    }
}
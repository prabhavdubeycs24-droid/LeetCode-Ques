class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                al.add(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
        }
        return al ; 
    }
}
class Solution {
    // at every element we have 2 choices either to take it or skip it , if take then we also need to backtrack
    public static void helper(int[] arr ,List<List<Integer>> ans,ArrayList<Integer> al, int idx){
        if(idx==arr.length){ // base condt
            ans.add(new ArrayList<>(al));
            return ; 
        }
        al.add(arr[idx]);
        helper(arr,ans,al,idx+1); // these 3 lines says than the index is included in the ans
        al.remove(al.size()-1);

        helper(arr,ans,al,idx+1); // yaha skip 
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        int idx = 0;
        helper(nums,ans,al,0);
        return ans ; 
    }
}
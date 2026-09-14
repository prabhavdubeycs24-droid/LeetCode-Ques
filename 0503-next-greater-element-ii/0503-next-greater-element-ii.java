class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] arr = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        for(int i=nums.length-1;i>=0;i--){
            st.push(nums[i]);
        }
        int idx = nums.length-1;
        while(idx>=0){
            if(st.size()!=0 && st.peek()<=nums[idx]){
                st.pop();
            }
            else if(st.size()==0){
                arr[idx]=-1;
                st.push(nums[idx]);
                idx--;
            }
            else{
                arr[idx]=st.peek();
                st.push(nums[idx]);
                idx--;
            }
        }
        return arr ;
    }
}
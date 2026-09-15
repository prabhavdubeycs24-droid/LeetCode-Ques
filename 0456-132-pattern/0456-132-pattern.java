class Solution {
    public boolean find132pattern(int[] nums) {
        if(nums.length<3){
            return false;
        }
        int n = nums.length ;
        Stack<Integer> st = new Stack<>();
        st.push(nums[n-1]);
        int two = Integer.MIN_VALUE;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<two){
                return true ; 
            }
            while(st.size()!=0 && nums[i]>st.peek()){
                two=st.pop();
            }
            st.push(nums[i]);
            
        }
        return false ; 

    }
}
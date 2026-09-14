class Solution {
    public int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        arr[n-1]=0;
        st.push(heights[n-1]);
        int idx = n-2;
        while(idx>=0){
            int count=0;
            while(st.size()!=0 &&  heights[idx]>st.peek()){
                count++;
                st.pop();
            }
            if(st.size()!=0){
                count++;
            }
            arr[idx]=count;
            st.push(heights[idx]);
            idx--;
        }
        return arr;
    }
}
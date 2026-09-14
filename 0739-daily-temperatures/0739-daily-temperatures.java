class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(n-1);
        arr[n-1]=0;
        int idx = n-2;
        while(idx>=0){
            if(st.size()==0){
                arr[idx]=0;
                st.push(idx);
                idx--;
            }
            else if(temp[st.peek()]>temp[idx]){
                arr[idx]=st.peek()-idx;
                st.push(idx);
                idx--;
            }
            else{
                st.pop();
            }
        }
        return arr;
    }
}
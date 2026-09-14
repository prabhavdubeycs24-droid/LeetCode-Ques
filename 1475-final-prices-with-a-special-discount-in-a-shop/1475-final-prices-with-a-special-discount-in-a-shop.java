//nse , storing ele not idx 
class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        Stack<Integer> st = new Stack<>();
        int[] arr = new int[n];
        st.push(prices[n-1]);
        arr[n-1]=prices[n-1];
        int idx = n-2;
        while(idx>=0){
            if(st.size()==0){
                arr[idx]=prices[idx];
                st.push(prices[idx]);
                idx--;
            }
            else if(st.peek()<=prices[idx]){
                arr[idx]=prices[idx]-st.peek();
                st.push(prices[idx]);
                idx--;
            }
            else{
                st.pop();
            }
        }
        return arr;
    }
}
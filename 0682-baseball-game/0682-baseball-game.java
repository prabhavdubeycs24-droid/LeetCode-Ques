class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        st.push(Integer.parseInt(operations[0]));
        for(int i=1;i<operations.length;i++){
            String s = operations[i];
            if((s.equals("D"))){
                int top = st.pop();
                st.push(top);
                st.push(top*2);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("+")){
                int top1=st.pop();
                int top2=st.pop();
                st.push(top2);
                st.push(top1);
                st.push(top1+top2);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum =0;
        while(st.size()!=0){
            sum=sum+st.pop();
        }
        return sum ; 
    }
}
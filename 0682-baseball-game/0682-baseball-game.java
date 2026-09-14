class Solution {
    public int calPoints(String[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<arr.length;i++){
            String s = arr[i];
            if(s.equals("D")){
                st.push(st.peek()*2);
            }
            else if(s.equals("C")){
                st.pop();
            }
            else if(s.equals("+")){
                int ele1 = st.pop();
                int ele2 = st.pop();
                st.push(ele2);
                st.push(ele1);
                st.push(ele1+ele2);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum=0;
        while(st.size()!=0){
            sum = sum+st.pop();
        }
        return sum ; 
    }
}
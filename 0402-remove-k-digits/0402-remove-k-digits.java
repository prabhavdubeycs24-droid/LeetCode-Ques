//scanning from left coz we want to make firstly make smaller the left side of the number(which hold highest place value)
class Solution {
    public String removeKdigits(String s, int k) {
        if(k==s.length()){
            return "0";
        }
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        int idx = 1 ;
        while(idx<s.length()){
            if(st.size()==0){
                st.push(s.charAt(idx));
                idx++;
            }
            else if(k!=0 && Character.getNumericValue(s.charAt(idx))<Character.getNumericValue(st.peek())){
                st.pop();
                k--;
            }
            else{
                st.push(s.charAt(idx));
                idx++;
            }
        }
        while(k!=0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb.reverse();
        while(sb.length()!=0 && sb.charAt(0)=='0'){
            sb.deleteCharAt(0);
        }
        if(sb.toString().equals("")){
            return "0";
        }
        return sb.toString();
    }
}
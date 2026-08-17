class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        int n = num.length();
        int idx = 1;
        st.push(num.charAt(0));
        while(idx<n){
            if(st.size()==0){
                st.push(num.charAt(idx));
                idx++;
            }
            else if(k>0 && num.charAt(idx)<st.peek()){
                st.pop();
                k--;
            }
            else{
                st.push(num.charAt(idx));
                idx++;
                
            }
        }  
        while(k!=0 && st.size()!=0){
            st.pop();
            k--;
        }
        StringBuilder sb = new StringBuilder();
        while(st.size()!=0){
            sb.append(st.pop());
        }
        sb=sb.reverse();
        while( sb.length()!= 0  && sb.charAt(0)=='0')
            sb.deleteCharAt(0);
            
        if(sb.length()==0){
            return "0" ;
        }
        return sb.toString();
    }
}
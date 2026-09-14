class Solution {
    public boolean isValid(String s) {
        if(s.length()%2!=0){
            return false;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()!=0 && ((st.peek()=='(' && s.charAt(i)==')') || (st.peek()=='[' && s.charAt(i)==']') || (st.peek()=='{' && s.charAt(i)=='}'))){
                st.pop();
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(st.size()==0){
            return true;
        }
        return false ; 
    }
}
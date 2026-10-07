class Solution {
    public static boolean ultaexist(Stack<Character> st){
        if(st.size()==0){
            return false;
        }
        boolean flag = false;
        int popped = 0;
        Stack<Character> st2  = new Stack<>();
        while(st.size()!=0){
            if(st.peek()=='(' && popped!=1){
                flag = true;
                st.pop();
                popped++;
            }
            if(st.size()!=0)st2.push(st.pop());
        }
        while(st2.size()!=0){
            st.push(st2.pop());
        }
        return flag;
    }
    // public static void rem(Stack<Character> st , char c){
    //     Stack<Integer> st3 = new Stack<>();
    //     while()
    // }
    public int minAddToMakeValid(String s) {
        if(s.length()==1){
            return 1;
        }
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(st.size()==0 || s.charAt(i)=='('){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i)==')' && ultaexist(st)==true){
                continue;
            }
            else if(s.charAt(i)==')'){
                st.push(s.charAt(i));
            }
            

        }
        return st.size();
    }
}
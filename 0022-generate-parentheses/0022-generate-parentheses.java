class Solution {
    public void helper(int n,ArrayList<String> al,String s,int left , int right){;
    if(right==n && left==n){
         al.add(s);
         return;
    }
    if(left<n){
        helper(n,al,s+"(",left+1,right);
    }
    if(left>right){
        helper(n,al,s+")",left,right+1);
    }
    }
    
    public List<String> generateParenthesis(int n) {
        ArrayList<String> al = new ArrayList<>();
        String s = "";
        helper(n,al,s,0,0);
        return al;
    }
}
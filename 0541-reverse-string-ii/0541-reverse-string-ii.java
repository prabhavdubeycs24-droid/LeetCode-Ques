class Solution {
    public String reverseStr(String s, int k) {
        
        StringBuilder sb = new StringBuilder(s);
        for(int x=0;x<=s.length();x+=2*k){
            int i = x;
            int j = Math.min(x+k-1,s.length()-1);
            while(i<j){
            char temp = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp);
            i++;
            j--;
            }
        }
        
        return sb.toString() ;
        
    }
}
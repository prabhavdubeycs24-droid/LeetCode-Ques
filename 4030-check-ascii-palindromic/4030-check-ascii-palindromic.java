class Solution {
    public boolean isPalindromic(String s) {
        if(s==null){
            return true;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            String a = Integer.toBinaryString(s.charAt(i));
            while(a.length()!=8){
                a='0'+a;
            }
            sb.append(a);
        }
        int i=0;
        int j=sb.length()-1;
        while(i<j){
            if(sb.charAt(i)!=sb.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
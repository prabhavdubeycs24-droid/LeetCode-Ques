class Solution {
    public String countAndSay(int n) {
        if(n==1){
            return "1"; 
        }
        String s = countAndSay(n-1);
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ans = new StringBuilder();
        int i = 0 ;
        while(i<sb.length()){
            int freq = 1; 
            char c = sb.charAt(i);
            while(i+1!=sb.length() && sb.charAt(i)==sb.charAt(i+1)){
                freq++;
                i++;
            }
            ans.append(freq);
            ans.append(c);
            i++;
        }
        return ans.toString();
    }
}
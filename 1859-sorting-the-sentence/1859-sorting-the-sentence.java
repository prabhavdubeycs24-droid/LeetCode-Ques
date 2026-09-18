class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String ans[] = new String[str.length];
        for(int i=0;i<str.length;i++){
            int pos = str[i].charAt(str[i].length()-1) - '0';
            ans[pos-1]=str[i].substring(0,str[i].length()-1);
        }
        return String.join(" ",ans);
    }
}
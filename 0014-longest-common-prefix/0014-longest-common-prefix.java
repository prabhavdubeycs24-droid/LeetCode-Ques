class Solution {
    public String longestCommonPrefix(String[] str) {
        Arrays.sort(str);
        String s1 = str[0];
        String s2 = str[str.length-1];
        int i=0;
        int j=0;
        StringBuilder sb = new StringBuilder();
        while(i<s1.length() && j<s2.length()){
            if(s1.charAt(i)==s2.charAt(j)){
                sb.append(s1.charAt(i));
                i++;
                j++;
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}
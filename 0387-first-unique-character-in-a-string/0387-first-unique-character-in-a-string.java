class Solution {
    public int firstUniqChar(String s) {
        int[] chat = new int[26];
        for(int i =0;i<s.length();i++){
            chat[s.charAt(i)-97]++;
        }
        for(int i =0;i<s.length();i++){
            if(chat[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}
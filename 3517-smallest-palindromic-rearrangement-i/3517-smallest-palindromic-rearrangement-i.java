class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s ;
        }
        int[] freq = new int[26];
        for(int i =0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        StringBuilder left = new StringBuilder();
        for(int i=0;i<freq.length;i++){
            for(int j=0;j<freq[i]/2;j++){
                left.append((char)('a'+i));
            }
        }
        StringBuilder mid = new StringBuilder();
        for(int i =0;i<freq.length;i++){
            if(freq[i]%2!=0){
                mid.append((char)('a'+i));
            }
        }
        String first = left.toString();
        String second = left.reverse().toString();
        return first+mid+second;
        


    }
}
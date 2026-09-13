class Solution {
    public int longestPalindrome(String s) {
        if(s.length()==1){
            return 1 ; 
        }
        int n = s.length();
        int[] freq = new int[52];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                freq[s.charAt(i)-'a']++;
            }
            else{
                freq[s.charAt(i)-'A'+26]++;
            }
        }
        int count =0;
        int odd = 0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0){
                count=count+freq[i];
            }
            else{
                count=count+freq[i]-1;
                odd=1;
            }
        }
        return count+odd;
    }
}
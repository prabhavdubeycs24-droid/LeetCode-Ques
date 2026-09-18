class Solution {
    public static boolean isVowel(char x){
        if(x=='a' || x=='e' || x=='i' || x=='o' || x=='u' || x=='A' ||x=='E' || x=='I' || x=='O' || x=='U'){
            return true;
        }
        else{
            return false;
        }
    }
    public String sortVowels(String s) {
        int[] freq = new int[128];
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(isVowel(x)){
                freq[x]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(!isVowel(s.charAt(i))){
                sb.append(s.charAt(i));
            }
            else{
                for(int j=0;j<128;j++){
                    if(freq[j]>0){
                        sb.append((char)j);
                        freq[j]--;
                        break ; 
                    }
                }
            }
        }
        return sb.toString() ;
    }
}
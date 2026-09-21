class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        if(n1!=n2){
            return false;
        }
        int[] freq1 = new int[256];
        int[] freq2 = new int[256];
        for(int i=0;i<n1;i++){
            if(freq1[s.charAt(i)]!=0 && freq1[s.charAt(i)]!=t.charAt(i)){
                return false;
            }
            freq1[s.charAt(i)]=t.charAt(i);
            if(freq2[t.charAt(i)]!=0 && freq2[t.charAt(i)]!=s.charAt(i)){
                return false;
            }
            freq2[t.charAt(i)]=s.charAt(i);
        }
        return true;
    }
}
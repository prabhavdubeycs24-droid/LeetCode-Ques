class Solution {
    public int numberOfSubstrings(String s) {
        int[] ls = {-1,-1,-1};
        int count =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            ls[ch-'a']=i;
            if(ls[0]!=-1 && ls[1]!=-1 && ls[2]!=-1){
                int len = Math.min(ls[0],Math.min(ls[1],ls[2]));//starting point of substring
                count = count + (1+len); // add 1 for 0 based indexing 
                
            }
        }
        return count ; 
    }
}
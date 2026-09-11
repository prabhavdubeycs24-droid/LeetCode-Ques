class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1;
        }
        int n = s.length();
        int i =0;
        int j = 1 ;
        int maxlen = Integer.MIN_VALUE;
        while(j<n){
            for(int k=j-1;k>=i;k--){
                if(s.charAt(k)==s.charAt(j)){
                    i=k+1;
                    break;
                }
            }
            int count = 0;
            j++;
            count = j-i;
            if(count>maxlen){
                maxlen=count;
            }
        
        }
        return maxlen; 

    }
}
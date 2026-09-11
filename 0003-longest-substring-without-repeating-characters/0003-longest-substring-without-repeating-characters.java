class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0){
            return 0;
        }
        if(s.length()==1){
            return 1 ; 
        }
        //stores last index of a particular character 
        int[] lastseen = new int[150];
        Arrays.fill(lastseen,-1);
        int i =0;
        int j = 0;
        int maxlen = Integer.MIN_VALUE;
        while(j<s.length()){
            int count = 0;
            if(lastseen[s.charAt(j)]<j && lastseen[s.charAt(j)]>=i){
                i=lastseen[s.charAt(j)]+1;
                lastseen[s.charAt(j)] = j;
                j++;
            }
            else{
                lastseen[s.charAt(j)]=j;
                j++;
                count = j-i;
                if(count>maxlen){
                    maxlen = count ; 
                }
            }
            
        }
        return maxlen ; 

    }
}
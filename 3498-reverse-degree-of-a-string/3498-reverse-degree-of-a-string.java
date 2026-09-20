class Solution {
    public int reverseDegree(String s) {
        int sum = 0;
        int freq[] = new int[26];
        int count=1;
        for(int i=freq.length-1;i>=0;i--){
            freq[i]=count;
            count++;
        }
        for(int i=0;i<s.length();i++){
            sum=sum+((i+1)*freq[s.charAt(i)-'a']);
        }
        return sum ; 
    }
}
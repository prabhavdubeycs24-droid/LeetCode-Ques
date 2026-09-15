class Solution {
    public String reverseWords(String s) {
        s=s.trim(); // removing spaces from aage and peeche
        String[] str = s.split("\\s+"); // O(n)
        int i=0;
        int j=str.length-1;
        while(i<j){
            String temp = str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        //StringBuilder sb = new StringBuilder();
        //for(i=0;i<str.length;i++){
        //    sb.append(str[i]+" ");
        //}
        //return sb.toString().trim();

        return String.join(" ",str);
    }
}
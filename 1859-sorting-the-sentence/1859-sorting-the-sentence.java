class Solution {
    public String sortSentence(String s) {
        String[] str = s.split(" ");
        String x = "1";
        StringBuilder sb = new StringBuilder();
        for(int j=1;j<=str.length;j++){
            x = Integer.toString(j);
        
            for(int i=0;i<str.length;i++){
                if(str[i].endsWith(x)){
                    sb.append(str[i].substring(0,str[i].length()-1)+" ");
                    break;

            }
        }
        }
        return sb.toString().trim();
    }
}
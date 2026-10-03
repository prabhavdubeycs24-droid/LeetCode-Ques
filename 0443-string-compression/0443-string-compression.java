class Solution {
    public int compress(char[] c) {
        int i= 0;
        int x = 0;
        while(i<c.length){
            char ch = c[i];
            int count = 0;
            while(i<c.length && c[i]==ch){
                count++;
                i++;
            }
            c[x]=ch;
            x++;
            if(count!=1){
                String cntstr = Integer.toString(count);
                for(int k=0;k<cntstr.length();k++){
                    c[x]=cntstr.charAt(k);
                    x++;
                }
            }
        }
        return x;
    }
}
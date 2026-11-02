class Solution {
    public String capitalizeTitle(String title) {
        String[] str = title.split(" ");
        for(int i=0;i<str.length;i++){
            if(str[i].length()<=2){
                str[i]=str[i].toLowerCase();
            }
            else{
                String s = str[i].toLowerCase();
                str[i]=Character.toUpperCase(s.charAt(0))+s.substring(1);
            }
        }
        return String.join(" ",str);
    }
}
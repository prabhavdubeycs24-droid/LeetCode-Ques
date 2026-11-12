class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] s1 = s.split(" ");
        if(pattern.length()!=s1.length){
            return false;
        }
        HashMap<Character,String> map = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char x = pattern.charAt(i);
            if(map.containsKey(x)){
                String a = map.get(x);
                if(!a.equals(s1[i])){
                    return false;
                }
            }
            else{
                map.put(x,s1[i]);
            }
        }
        HashMap<String,Character> map1 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(s1[i])){
                char x = map1.get(s1[i]);
                if(!(x==pattern.charAt(i))){
                    return false;
                }
            }
            else{
                map1.put(s1[i],pattern.charAt(i));
            }
        }
        return true;
    }
}
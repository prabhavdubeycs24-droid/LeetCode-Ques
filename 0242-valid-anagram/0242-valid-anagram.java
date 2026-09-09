class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false ; 
        }
        char[] arr = s.toCharArray();
        char[] arr1 = t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr1);
        String s1 = Arrays.toString(arr);
        String t1 = Arrays.toString(arr1);
        if(s1.equals(t1)){
            return true ; 
        }
        else{
            return false ;
        }
    }
}
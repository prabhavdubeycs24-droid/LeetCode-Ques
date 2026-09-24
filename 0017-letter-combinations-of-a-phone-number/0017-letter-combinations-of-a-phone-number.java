class Solution {
    public static void helper(int idx , String digits , ArrayList<String> al , StringBuilder sb){
        if(idx==digits.length()){
            al.add(sb.toString());
            return;
        }
        String[] arr = {
             "","", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };
        String letter = arr[digits.charAt(idx)-'0'];
        for(int i=0;i<letter.length();i++){
            sb.append(letter.charAt(i));
            helper(idx+1,digits,al,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(0,digits,al,sb);
        return al ; 
    }
}
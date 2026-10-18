class Solution {
    public int[] decimalRepresentation(int n) {
        String s = Integer.toString(n);
        int mult = 1 ; 
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!='0'){
                al.add((s.charAt(i)-'0')*mult);
                mult=mult*10;
            }
            else{
                mult=mult*10;
            }
        }
        int[] arr = new int[al.size()];
        Collections.reverse(al);
        for(int j=0;j<al.size();j++){
            arr[j]=al.get(j);
        }
        return arr ; 
    }
}
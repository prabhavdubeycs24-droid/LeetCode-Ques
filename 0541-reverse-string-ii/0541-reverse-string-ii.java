class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for(int x =0;x<arr.length;x=x+2*k){
            int i=x;
            int j = Math.min(x+k-1,arr.length-1);
            while(i<j){
                char temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return String.valueOf(arr);
    }
}
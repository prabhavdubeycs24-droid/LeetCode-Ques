class Solution {
    public int smallestIndex(int[] arr) {
        for(int i=0;i<arr.length;i++){
            StringBuilder sb = new StringBuilder();
            sb.append(arr[i]);
            int sum = 0;
            while(sb.length()!=0){
                sum = sum + sb.charAt(0)-'0';
                sb.deleteCharAt(0);
            }
            if(sum==i){
                return i ; 
            }
        }
        return -1;
    }
}
class Solution {
    public int findDuplicate(int[] arr) {
        int n = arr.length;
        boolean[] bool = new boolean[arr.length];
        for(int i=0;i<n;i++){
            if(bool[arr[i]]==true){
                return arr[i];
            }
            bool[arr[i]]=true;
        }
        return -1;
    }
}
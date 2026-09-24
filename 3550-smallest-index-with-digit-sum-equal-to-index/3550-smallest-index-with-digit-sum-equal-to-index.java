class Solution {
    public int smallestIndex(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int t = arr[i];
            int x = t%10;
            t=t/10;
            int y = t%10;
            t=t/10;
            int z= t%10;
            t=t/10;
            int z1 = t%10;
            if(x+y+z+z1==i){
                return i ;
            }
            
        }
        return -1;
    }
}
class Solution {
    public int[] singleNumber(int[] arr) {
        if(arr.length==2){
            return arr; 
        }
        int xor = 0 ; 
        for(int i=0;i<arr.length;i++){
            xor=xor^arr[i];
        }
        // now make a mask , only containing the right most sub-bit
        int mask = (xor&(xor-1))^xor;
        int b1 = 0 ; // zero 
        int b2 = 0 ; // non-zero 
        for(int i=0;i<arr.length;i++){
            if((arr[i]&mask)==0){
                b1=b1^arr[i];
            }
            else{
                b2=b2^arr[i];
            }
        }
        return new int[]{b1,b2};
    }
}
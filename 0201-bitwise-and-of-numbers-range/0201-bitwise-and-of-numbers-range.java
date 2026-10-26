class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        int times = 0 ; 
        while(left!=right){
            left=left>>1;
            right=right>>1;
            times++;
        }
        return left<<times;

    }
}
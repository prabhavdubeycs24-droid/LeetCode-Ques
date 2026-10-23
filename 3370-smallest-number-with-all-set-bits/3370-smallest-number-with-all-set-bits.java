class Solution {
    public int smallestNumber(int n) {
        int x = Integer.highestOneBit(n);
        return (x*2)-1;
    }
}
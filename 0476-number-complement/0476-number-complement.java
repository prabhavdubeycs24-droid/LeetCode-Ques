class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        int mask = 1 ; 
        int len = 0 ; 
        int n = num ; 
        while(n!=0){
            len++;
            n=n>>1;
        }
        mask=(mask<<len)-1;
        return num^mask;
    }
}
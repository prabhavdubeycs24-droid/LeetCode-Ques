class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            if(num%2==0){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
            num=num>>1;
        }
        return Integer.parseInt(sb.reverse().toString(),2);
    }
}
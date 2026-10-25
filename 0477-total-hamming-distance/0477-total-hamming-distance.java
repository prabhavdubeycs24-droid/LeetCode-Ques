class Solution {
    public int totalHammingDistance(int[] arr) {
        int sum = 0; 
        for(int i=0;i<=31;i++){
            int countone = 0;
            int countzero = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]%2==0){
                    countzero++;
                }
                else{
                    countone++;
                }
                arr[j]=arr[j]>>1;
            }
            sum = sum+(countone*countzero);
        }
        return sum ; 
    }
}
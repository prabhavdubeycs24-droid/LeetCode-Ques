class Solution {
    public int singleNumber(int[] arr) {
        int[] onec = new int[32];
        for(int i=0;i<=31;i++){
            int count = 0; 
            for(int j=0;j<arr.length;j++){
                if(arr[j]%2!=0){
                    count++;
                }
                arr[j]=arr[j]>>>1;
            }
            onec[i]=count;
        }
        StringBuilder sb = new StringBuilder(32);
        for(int i=0;i<=31;i++){
            if(onec[i]%3!=0){
                sb.append('1');
            }
            else{
                sb.append('0');
            }
        }
        sb.reverse();
        return (int)Long.parseLong(sb.toString(),2);
    }
}
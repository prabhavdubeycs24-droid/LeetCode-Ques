class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int i =0;
        int n = arr.length;
        while(i<arr.length){
            if(arr[i]==arr[arr[i]-1] || arr[i]==i+1){
                i++;
            }
            else{
                int idx = arr[i];
                int temp = arr[i];
                arr[i]=arr[idx-1];
                arr[idx-1]=temp;
            }
        }
        for(i =0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans[0]=arr[i];
                ans[1]=i+1;
            }
        }
        return ans ;
    }
}
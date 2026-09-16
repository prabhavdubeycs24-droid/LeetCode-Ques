class Solution {
    public int[] findErrorNums(int[] arr) {
        int[] ans = new int[2];
        int n = arr.length;
        int i =0;
        while(i<n){
            if(arr[i]==i+1 || arr[i]==arr[arr[i]-1]){
                i++;
            }
            else{
                int idx = arr[i]-1;
                int temp = arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                ans[0]=arr[j];
                ans[1]=j+1;
                return ans;
            }
        }
        return new int[]{0,0};
    }
}
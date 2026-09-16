class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            if(arr[i]==i+1 || arr[i]==arr[arr[i]-1]){
                i++;
            }
            else{
                int idx =arr[i];
                int temp=arr[i];
                arr[i]=arr[idx-1];
                arr[idx-1]=temp ;
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                ans.add(i+1);
            }
        }
        return ans;
    }
}
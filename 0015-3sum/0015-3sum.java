class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i =0;i<arr.length-1;i++){
            if (i > 0 && arr[i] == arr[i - 1])
                continue;
            int j = i+1 ;
            int k = arr.length-1;
            while(k>j){
                if(arr[k]+arr[i]+arr[j]==0 && i!=j && i!=k && j!=k){
                    List<Integer> temp = new ArrayList<>();

                    temp.add(arr[i]);
                    temp.add(arr[j]);
                    temp.add(arr[k]);

                    ans.add(temp);
                     k--;
                     j++;
                    while (j < k && arr[j] == arr[j - 1])
                        j++;

                    while (j < k && arr[k] == arr[k + 1])
                        k--;
                }
                else if(arr[k]+arr[j]+arr[i]>0){
                    k--;
                }
                else{
                    j++;
                }
            }
        }
        return ans ;
    }
}
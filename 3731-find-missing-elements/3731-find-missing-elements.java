class Solution {
    public List<Integer> findMissingElements(int[] arr) {
        Arrays.sort(arr);

        int max = arr[arr.length-1];
        int min = arr[0];
        ArrayList<Integer> al = new ArrayList<>();
        int j =1;
        for(int i=min+1;i<max;i++){
            if(i==arr[j]){
                j++;
                continue;
                
            }
            else{
                al.add(i);
            }
        }
        return al ;
    }
}
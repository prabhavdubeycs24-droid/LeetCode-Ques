//index marking:numbers from 1 to n , at max two , so whenever we get a number make it's corresponding index negative and if some number leads to the index of a negative number we add it in the ans 
class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            int x = Math.abs(arr[i]);
            if(arr[x-1]<0){
                al.add(x);
            }
            else{
                arr[x-1]=-1*(arr[x-1]);
            }
        }
        return al ; 
    }
}
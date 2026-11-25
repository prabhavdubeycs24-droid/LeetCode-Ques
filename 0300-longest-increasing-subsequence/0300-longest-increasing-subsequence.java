class Solution {
    public int lengthOfLIS(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(arr[0]);
        int i = 1 ; 
        while(i<arr.length){
            if(arr[i]>al.get(al.size()-1)){
                al.add(arr[i]);
            }
            else{
                int l = 0 ; 
                int r = al.size();
                int idx = -1 ;
                while(l<r){
                    int mid = ((r-l)/2) + l;
                    if(al.get(mid)<arr[i]){
                        l=mid+1;
                    }
                    else{ // mid is greater than equal to arr[i] , include mid in search space 
                        r=mid; 
                    }
                }
                // loop terminates when l==r therefore use anything
                al.set(r,arr[i]);
            }
            i++;
        }
        return al.size();
    }
}
class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0 ; 
        Arrays.sort(arr2);
        for(int i = 0; i<arr1.length;i++){
            int x = 0 ; 
            int y = arr2.length-1;
            int mid = (x+y)/2;; 
            while(x<=y){
                mid = x + (y-x)/2;

                if(arr2[mid] < arr1[i]){
                    x = mid + 1;
                }
                else{
                    y = mid - 1;
                }
            }
            if((x == arr2.length || Math.abs(arr2[x]-arr1[i]) > d) &&
               (x == 0 || Math.abs(arr2[x-1]-arr1[i]) > d)) {
                count++;
            }           
        }
        return count ; 
    }
}
class Solution {
    public int maxArea(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        int max = 0;
        while(i<=j){
            int area = Math.min(arr[i],arr[j])*(j-i);
            if(area>max){
                max = area ;
            }
            if(arr[j]>arr[i]){
                i++;
            }
            else{
                j--;
            }

        }
        return max; 
    }
}
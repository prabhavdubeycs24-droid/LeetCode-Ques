class Solution {
    public int findMiddleIndex(int[] arr) {
        int left = 0;
        int right = 0;
        int[] leftsum = new int[arr.length];
        leftsum[0]=0;
        for(int i=0;i<arr.length-1;i++){
            left=left+arr[i];
            leftsum[i+1]=left;
        }
        int[] rightsum = new int[arr.length];
        rightsum[arr.length-1]=0;
        for(int i =arr.length-1;i>0;i--){
            right=right+arr[i];
            rightsum[i-1]=right;
        }
        for(int i=0;i<arr.length;i++){
            if(leftsum[i]==rightsum[i]){
                return i ; 
            }
        }
        return -1;
        
    }
}
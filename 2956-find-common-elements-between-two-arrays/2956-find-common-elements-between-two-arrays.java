class Solution {
    public int[] findIntersectionValues(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        int[] ans = new int[2];
        int count1 = 0;
        int count2 = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                count1++;
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
            
        }
        i=0;
        j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]==arr2[j]){
                count2++;
                j++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                i++;
            }
            
        }
        ans[0]=count1;
        ans[1]=count2;
        return ans ; 
    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr1 = new int[nums2.length];
        Stack<Integer> st = new Stack<>();
        int n = nums2.length;
        st.push(nums2[nums2.length-1]);
        arr1[n-1]=-1;
        int idx = n-2;
        while(idx>=0){
            if(st.size()!=0 && st.peek()>nums2[idx]){
                arr1[idx]=st.peek();
                st.push(nums2[idx]);
                idx--;
            }
            else if(st.size()==0){
                arr1[idx]=-1;
                st.push(nums2[idx]);
                idx--;
            }
            else{
                st.pop();
            }
        }
        int[] arr2 = new int[nums1.length];
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums1[j]==nums2[i]){
                    arr2[j]=arr1[i];
                }
            }
        }
        return  arr2;

    }
}
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        int[] arr = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(nums2[n-1]);
        arr[n-1]=-1;
        int idx = n-2;
        while(idx>=0){
            int ele = nums2[idx];
            if(st.size()==0){
                arr[idx]=-1;
                idx--;
                st.push(ele);
            }
            else if(st.peek()<ele){
                st.pop();
            }
            else{
                arr[idx]=st.peek();
                st.push(ele);
                idx--;
            }
        }
        int[] arr2 = new int[nums1.length];
        for(int i =0;i<nums1.length;i++){
            int ele = nums1[i];
            for(int j = 0;j<nums2.length;j++){
                if(ele==nums2[j]){
                    arr2[i]=arr[j];
                }
            }
        }
        return arr2;
    }
}
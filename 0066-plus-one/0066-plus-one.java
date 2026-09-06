class Solution {
    public int[] plusOne(int[] arr) {
        int carry = 1;
        int i = arr.length-1;
        ArrayList<Integer> ans = new ArrayList<>();
        while(i>=0){
            int sum = arr[i]+carry;
            ans.add(sum%10);
            carry=sum/10;
            i--;
        }
        if(carry==1){
            ans.add(1);
        }
        int n = ans.size();
        int[] ans1 = new int[n];
        
        for(int j =0;j<ans.size();j++){
            ans1[j]=ans.get(n-1-j);
        }
        return ans1;
    }
}
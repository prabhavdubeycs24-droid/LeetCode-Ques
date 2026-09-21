class Solution {
    public String addStrings(String num1, String num2) {
        int n1 = num1.length();
        int n2 = num2.length();
        int i=n1-1;
        int j=n2-1;
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        while(i>=0 && j>=0){
            int a = num1.charAt(i)-'0';
            int b = num2.charAt(j)-'0';
            int sum = a+b+carry;
            carry = sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        while(i>=0){
            int a = num1.charAt(i)-'0';
            int sum = a+carry;
            carry = sum/10;
            sb.append(sum%10);
            i--;
        }
        while(j>=0){
            int b = num2.charAt(j)-'0';
            int sum = b+carry;
            carry = sum/10;
            sb.append(sum%10);
            j--;
        }
        if(carry==1){
            sb.append("1");
        }
        return sb.reverse().toString();
    }
}
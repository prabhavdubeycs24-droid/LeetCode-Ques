class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = new ListNode(-1);
        ListNode temp = head ; 
        int carry = 0;
        while(temp1!=null && temp2!=null){
            int sum = (temp1.val+temp2.val+carry);
            carry=sum/10;
            
            ListNode ans = new ListNode(sum%10);
            temp.next=ans; 
            temp=ans;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        if(temp1!=null){
            while(temp1!=null){
                int sum= temp1.val+carry;
                ListNode ans = new ListNode((temp1.val+carry)%10);
                carry = sum/10;
                temp.next=ans;
                temp=ans;
                temp1=temp1.next;

            }
        }
        if(temp2!=null){
            while(temp2!=null){
                int sum = temp2.val+carry;
                ListNode ans = new ListNode((temp2.val+carry)%10);
                carry=sum/10;
                temp.next=ans;
                temp=ans;
                temp2=temp2.next;
            }
        }
        if(carry==1){
            ListNode ans = new ListNode(1);
            temp.next=ans;
            temp=ans;
        }
        temp.next=null;
        return(head.next);

    }
}
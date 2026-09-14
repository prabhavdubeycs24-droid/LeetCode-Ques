
class Solution {
    public ListNode removeNodes(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            if(st.size()!=0 && st.peek()<temp.val){
                st.pop();
            }
            else{
                st.push(temp.val);
                temp=temp.next;
            }
        }
        ListNode dummy = new ListNode (-1);
        temp=dummy;
        Stack<Integer> st2 = new Stack<>();
        while(st.size()!=0){
            st2.push(st.pop());
        }
        while(st2.size()!=0){
            ListNode ans = new ListNode(st2.pop());
            temp.next=ans;
            temp=temp.next;
        }
        temp.next=null;
        return dummy.next;
    }
}
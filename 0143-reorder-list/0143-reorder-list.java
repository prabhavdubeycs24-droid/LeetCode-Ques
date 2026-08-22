class Solution {
    public static ListNode reverse(ListNode head){
        ListNode c = head ;
        ListNode p = null;
        ListNode f = null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p ; 
    }
    public void reorderList(ListNode head1) {
        ListNode slow = head1 ;
        ListNode fast = head1 ;
        fast=fast.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 =reverse(slow.next);
        slow.next=null;
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        while(temp2!=null ){
            ListNode a = temp1.next;
            ListNode b = temp2.next; 
           temp1.next=temp2;
           temp2.next=a;
           temp1=a;
           temp2=b;
        }
    }
}
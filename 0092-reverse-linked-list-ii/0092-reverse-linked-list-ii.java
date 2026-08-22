class Solution {
    public static ListNode reverse(ListNode head ){
        ListNode c = head ; 
        ListNode p = null ;
        ListNode f = null ;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p ; 
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next=head;
        ListNode temp = dummy ;
        for(int i=1;i<left;i++){
            temp=temp.next;
        }
        ListNode temp2=head;
        for(int i=1;i<right;i++){
            temp2=temp2.next;
        }
        ListNode head2=temp.next;
        temp.next=null;
        ListNode head3 = null;
        if(temp2!=null) head3 = temp2.next;
        if(temp2!=null) temp2.next=null;

        ListNode newHead = reverse(head2);

        temp.next=newHead;
        if(head2!=null) head2.next=head3 ;
        return dummy.next;  
    }
}
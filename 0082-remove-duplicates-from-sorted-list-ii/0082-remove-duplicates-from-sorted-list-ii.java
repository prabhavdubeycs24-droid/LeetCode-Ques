class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head ; 
        }
        ListNode slow = head ; 
        ListNode fast = head.next ; 
        ListNode dummy = new ListNode(-1);
        ListNode preslow = dummy;
        preslow.next=head ; 
        while(fast!=null){
            if(slow.val==fast.val){
                fast=fast.next;
            }
            else{
                if(slow.next==fast){
                    preslow=slow;
                    slow=slow.next;
                    fast=fast.next;

                }
                else{
                    preslow.next=fast;
                    slow=fast;
                    
                    fast=fast.next;
                }
            }
        }
        if(slow.next==fast){
            preslow.next=slow;
            slow.next=null;
        }
        else{
            preslow.next=fast;
        }
        return dummy.next ; 

    }
}
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head ; 
        ListNode fast = head ; 
        int kyu = 0;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                kyu=1;
                break ; 
            }
        }
        if(kyu==0){
            return null ; 
        }
        ListNode temp = head ; 
        while(temp!=slow){
            temp=temp.next;
            slow=slow.next;
        }
        return slow;
    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true ; 
        }
        ListNode slow = head ; 
        ListNode fast = head.next ; 
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null ; 
        ListNode temp = head2 ; 
        ListNode c = temp;
        ListNode p = null;
        ListNode f = null;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        while(p!=null){
            if(head.val==p.val){
                head=head.next;
                p=p.next;
            }else{
                return false;
            }
        }
        return true ; 
    }
}
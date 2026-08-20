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
    public ListNode deleteDuplicates(ListNode head) {
       if(head==null){
        return head ; 
       }
       ListNode dummy = new ListNode(-1);
       dummy.next=head;
       ListNode slow = head ; 
       ListNode fast = head ; 
       while(fast!=null){
        if(slow.val==fast.val){
            fast=fast.next;
        }
        else{
            slow.next=fast;
            slow=fast;
        }
       }
       slow.next=null;
       return head ; 

    }
}
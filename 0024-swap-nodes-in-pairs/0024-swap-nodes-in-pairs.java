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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy ;
        ListNode temp1 = head ;
        ListNode temp2 = head.next ; 
        while(temp1!=null  && temp1.next!=null){
            temp.next=temp2;
            temp1.next=temp2.next;
            temp2.next=temp1;
            temp=temp1;
            temp1=temp1.next;
            if(temp1!=null) temp2=temp1.next;
        }
        return dummy.next;

    }
}
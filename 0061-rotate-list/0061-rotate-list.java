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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null){
            return head ; 
        }
        int size = 0;
        ListNode temp = head ; 
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        if(k==0){
            return head;
        }
        temp=head;
        for(int i=1;i<size-k;i++){
            temp=temp.next;
        }
        ListNode newhead = temp.next;
        temp.next=null;
        ListNode t = newhead;
        while(t!=null && t.next!=null){
            t=t.next;
        }
        t.next=head;
        return newhead;
    }
}
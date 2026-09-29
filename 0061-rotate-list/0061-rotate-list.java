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
        ListNode temp = head ;
        int size = 0;
        while(temp!=null){
            temp=temp.next;
            size++;
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
        temp = newhead;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=head;
        return newhead;
    }
}
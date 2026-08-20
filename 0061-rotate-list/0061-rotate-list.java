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
            return head;
        }
        ListNode temp = head ; 
        int size = 0 ;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        k=k%size;
        temp=head;
        for(int i =1;i<size-k;i++){
            temp=temp.next;
        }
        ListNode newHead = temp.next;
        temp.next=null;
        ListNode temp1=newHead;
        if(temp1==null){
            return head ; 
        }
        while(temp1.next!=null){
            temp1=temp1.next;
        }
        temp1.next=head;
        return newHead;
        

    }
}
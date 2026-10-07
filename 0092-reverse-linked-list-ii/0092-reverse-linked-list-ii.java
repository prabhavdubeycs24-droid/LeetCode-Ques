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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right){
            return head ;
        }
        
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy ;
        temp.next=head;
        //left pos ke ek node pehle
        for(int i=1;i<left;i++){
            temp=temp.next;
        }
        ListNode revhead = temp.next;
        //going to the right p0s node 
        ListNode temp2=head;
        for(int i=1;i<right;i++){
            temp2=temp2.next;
        }
        ListNode newhead = temp2.next;
        temp2.next=null;
        ListNode naya = reverse(revhead);
        temp.next=naya;
        revhead.next=newhead;
        return dummy.next ; 
    }
}
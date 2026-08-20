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
    public ListNode partition(ListNode head, int x) {
        ListNode d1 = new ListNode(-1);
        ListNode temp1= d1;
        ListNode d2 = new ListNode(-1);
        ListNode temp2 = d2;
        ListNode temp = head ;
        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                temp1=temp1.next;
            }
            else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp1.next=d2.next;
        temp2.next=null;
        return d1.next;
    }
}
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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy ; 
        ListNode temp = head ;
        int sum = 0; 
        while(temp!=null){
            if(temp.val!=0){
                sum = sum + temp.val;
            }
            else{
                if(sum==0){
                    temp=temp.next;
                    continue;
                }
                ListNode naya = new ListNode(sum);
                sum=0;
                t.next=naya;
                t=t.next;
            }
            temp=temp.next;
        }
        return dummy.next;
    }
}
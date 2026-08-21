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
    public int pairSum(ListNode head) {
        if(head.next.next==null){
            return head.val + head.next.val ; 
        }
        ListNode slow = head ; 
        ListNode fast = head.next ; 
        while(fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode temp = slow.next;
        slow.next = null ; 
        ListNode c = temp ;
        ListNode f = null;
        ListNode p = null ;
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        ListNode temp1 = p ; 
        ListNode temp2 = head ; 
        int max =-1;
        while(temp1!=null && temp2!=null ){
            int sum = temp1.val+temp2.val;
            if(sum>max){
                max=sum;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return max ; 
    }
}
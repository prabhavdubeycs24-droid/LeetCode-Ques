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
    public int pairSum(ListNode head1) {
        if(head1==null){
            return 0;
        }
        if(head1.next.next==null){
            return head1.val+head1.next.val;
        }
        ListNode slow = head1 ; 
        ListNode fast = head1 ; 
        fast=fast.next;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode head2 = slow.next;
        head2 = reverse(head2);
        slow.next=null;
        int max = Integer.MIN_VALUE; 
        ListNode temp1 = head1 ; 
        ListNode temp2 = head2 ;
        while(temp1!=null){
            int sum = temp1.val + temp2.val ;
            if(sum>max){
                max=sum;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return max ; 

    }
}
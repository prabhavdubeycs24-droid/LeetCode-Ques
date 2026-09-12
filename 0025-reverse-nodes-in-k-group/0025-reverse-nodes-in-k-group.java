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
        ListNode curr = head ; 
        ListNode p = null;
        ListNode f = null;
        while(curr!=null){
            f=curr.next;
            curr.next=p;
            p=curr;
            curr=f;
        }
        return p;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        
        int size=0;
        ListNode temp = head ;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int cap = size/k;
        ListNode[] arr = new ListNode[cap];
        for(int i=0;i<cap;i++){
            arr[i]=head;
            int currcap=k;
            temp=head;
            int j =0;
            while(j<currcap-1){
                temp=temp.next;
                j++;
            }
            if(temp!=null){
                head=temp.next;
                temp.next=null;
            }

        }
        //arr has all grp 
        // ab reverse kro each group
        for(int i=0;i<arr.length;i++){
            arr[i]=reverse(arr[i]);
        }
        // ab join kroo
        ListNode dummy = new ListNode(-1);
        temp = dummy ;
        for(int i=0;i<arr.length;i++){
            temp.next=arr[i];
            while(temp.next!=null){
                temp=temp.next;
            }
        }
        temp.next=head;
        return dummy.next;
    }
}
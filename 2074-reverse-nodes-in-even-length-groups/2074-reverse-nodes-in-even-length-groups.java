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
    public static int size(ListNode head){
        ListNode temp = head ; 
        int size=0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        return size ; 
    }
    public static ListNode reverse(ListNode head){
        ListNode c = head ; 
        ListNode p = null;
        ListNode f = null ; 
        while(c!=null){
            f=c.next;
            c.next=p;
            p=c;
            c=f;
        }
        return p ; 
    }
    public ListNode reverseEvenLengthGroups(ListNode head) {
        if(head==null || head.next==null || head.next.next==null){
            return head ; 
        }
        ArrayList<ListNode> al = new ArrayList<>();
        ListNode temp = head;
        int length=1;
        while(temp!=null){
            al.add(head);
            int i=0;
            while(i!=length-1){
                if(temp==null){
                    break;
                }
                temp=temp.next;
                i++;
            }
            if(temp!=null){
                head=temp.next;
                temp.next=null;
                temp=head;
            }
            length=length+1;
        }
        for(int i=0;i<al.size();i++){
            if(size(al.get(i))%2==0){
                al.set(i,reverse(al.get(i)));
            }
        }
        ListNode dummy = new ListNode(-1);
        temp = dummy;
        for(int i =0;i<al.size();i++){
            temp.next=al.get(i);
            temp=temp.next;
            while(temp.next!=null){
                temp=temp.next;
            }
        }    
        return dummy.next;
    }
}
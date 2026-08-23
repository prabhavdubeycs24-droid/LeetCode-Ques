/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node temp = head ; 
        Node dummy = new Node(-1);
        Node t = dummy;
        while(temp!=null){
            Node l = new Node(temp.val);
            t.next=l;
            t=t.next;
            temp=temp.next;
        }
        Node dummy1 = new Node(-1);
        temp=dummy1;
        Node temp1 = head ; 
        Node temp2 = dummy.next;
        while(temp1!=null && temp2!=null){
            temp.next=temp1;
            temp=temp.next;
            temp1=temp1.next;
            temp.next=temp2;
            temp=temp.next;
            temp2=temp2.next;
        }
        temp=dummy1.next;
        while(temp!=null){
            if(temp.random==null){
                temp.next.random=null;
            }
            else{
                temp.next.random=temp.random.next;
            }
            temp=temp.next.next;
        }
        Node t1 = new Node(-1);
        Node t2 = new Node(-1);
        temp1=t1;
        temp2=t2;
        temp=dummy1.next;
        Node ans = dummy.next;
        while(temp!=null){
            temp1.next=temp;
            temp=temp.next;
            temp1=temp1.next;
            temp2.next=temp;
            temp=temp.next;
            temp2=temp2.next;
        }
        temp1.next=null;
        return ans;
    }
}
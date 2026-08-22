/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if(head==null){
            return head;
        }
        Node curr = head ; 
        while(curr!=null){
            if(curr.child==null){
                curr=curr.next;
            }
            else{
                Node a = curr.next;
                Node ans = flatten(curr.child);
                curr.child=null;
                ans.prev=curr;
                curr.next=ans;
                Node temp = ans;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=a;
                if(a!=null) a.prev=temp;
                curr=a;
            }
        }
        return head ; 
    }
}
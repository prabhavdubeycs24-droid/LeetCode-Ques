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
            return null;
        }
        Node curr = head;
        while(curr!=null){
            if(curr.child==null){
                curr=curr.next;
            }
            else{
                Node save = curr.next;
                Node ans = flatten(curr.child);
                curr.child=null;
                curr.next=ans;
                ans.prev=curr;
                Node temp=ans;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=save;
                if(save!=null) save.prev=temp;
                curr=save;
            }
        }
        return head ; 
    }
}
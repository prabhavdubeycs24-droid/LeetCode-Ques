public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int sizeA =0;
        int sizeB =0;
        ListNode temp=headA;
        while(temp!=null){
            sizeA++;
            temp=temp.next;
        }
        temp=headB;
        while(temp!=null){
            sizeB++;
            temp=temp.next;
        }
        ListNode tempA = headA;
        ListNode tempB = headB;
        if(sizeA>sizeB){
            int n = sizeA-sizeB;
            for(int i=0;i<n;i++){
                tempA=tempA.next;
            }
        }
        else{
            int n = sizeB-sizeA;
            for(int i=0;i<n;i++){
                tempB=tempB.next;
            }
        }
        while(tempA!=null && tempB!=null){
            if(tempA==tempB){
                return tempA;
            }
            tempA=tempA.next;
            tempB=tempB.next;
        }
        return null ; 
    }
}
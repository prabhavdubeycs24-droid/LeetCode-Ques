
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head;
        ListNode[] ans = new ListNode[k];
        int size =0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int cap = size/k;
        int xtra = size%k;
        for(int i=0;i<k;i++){
            ans[i]=head;
            int currcap=cap;
            if(xtra!=0){
                currcap=cap+1;
                xtra--;
            }
            int j = 0 ; 
            temp=head;
            while(j<currcap-1){
                temp=temp.next;
                j++;
            }
            if(temp!=null){
                head=temp.next;
                temp.next=null;
            }
        
        }
        return ans ; 
    }
}
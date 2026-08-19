class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode temp = head ; 
        int size = 0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int Capacity = size/k;
        int extra = size%k ; 
        ListNode[] ans = new ListNode[k];
        for(int i =0;i<k;i++){
            int currCapacity=0;
            ans[i] = head ; 
            if(extra!=0){
                currCapacity=Capacity+1;
                extra--;
            }
            else{
                currCapacity=Capacity;
            }
            int x = 0 ;
            temp = head ; 
            while(x<currCapacity-1 && temp!=null) {
                temp=temp.next;
                x++;
            }
            if(temp!=null){
                head=temp.next;
                temp.next=null;
            }
        }
        return ans; 
    }
}
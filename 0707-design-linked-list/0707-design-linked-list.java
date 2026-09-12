class MyLinkedList {
    ListNode head ; 

    class ListNode{
        int val ;
        ListNode next;

        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }

    public MyLinkedList() {
        head=null;
    }
    
    public int get(int index) {
        ListNode temp = head ;
        int i=0;

        while(i!=index && temp!=null){
            i++;
            temp=temp.next;
        }

        if(temp==null){
            return -1;
        }

        return temp.val ; 
    }
    
    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);

        if(head==null){
            head=temp;
            return;
        }

        temp.next=head;
        head=temp;
    }
    
    public void addAtTail(int val) {
        ListNode temp = head ; 
        ListNode temp1 = new ListNode(val);

        if(head==null){
            head=temp1;
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=temp1;
    }
    
    public void addAtIndex(int index, int val) {
        if(index==0){
            addAtHead(val);
            return;
        }

        if(head==null){
            return;
        }

        int i=0;
        ListNode temp=head;

        while(i!=index-1 && temp!=null){
            i++;
            temp=temp.next;
        }

        if(temp==null){
            return;
        }

        if(temp.next==null && i+1!=index){
            return;
        }

        ListNode temp2=new ListNode(val);
        temp2.next=temp.next;
        temp.next=temp2;
    }
    
    public void deleteAtIndex(int index) {
        if(head==null){
            return;
        }

        if(index==0){
            head=head.next;
            return;
        }

        int i=0;
        ListNode temp=head;

        while(i!=index-1 && temp!=null){
            i++;
            temp=temp.next;
        }

        if(temp==null || temp.next==null){
            return;
        }

        temp.next=temp.next.next;
    }
}
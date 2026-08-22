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
    public static ListNode merge(ListNode head1 , ListNode head2){
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        while(temp1!=null && temp2!=null){
            if(temp1.val<temp2.val){
                temp.next=temp1;
                temp1=temp1.next;
            }
            else{
                temp.next=temp2;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        if(temp1!=null){
            temp.next=temp1;
        }
        if(temp2!=null){
            temp.next=temp2;
        }
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        ArrayList<ListNode> arr1 = new ArrayList<>();
        ArrayList<ListNode> arr2 = new ArrayList<>();
        for(ListNode ele : lists){
            arr1.add(ele);
        }
        while(arr1.size()+arr2.size()>1){
            while(arr1.size()>1){
                ListNode a = arr1.get(arr1.size()-1);
                arr1.remove(arr1.size()-1);
                ListNode b = arr1.get(arr1.size()-1);
                arr1.remove(arr1.size()-1);
                ListNode c = merge(a,b);
                arr2.add(c);
            }
            if(arr1.size()==1){
                arr2.add(arr1.get(0));
                arr1.remove(0);
            }
            while(arr2.size()>1){
                ListNode a = arr2.get(arr2.size()-1);
                arr2.remove(arr2.size()-1);
                ListNode b = arr2.get(arr2.size()-1);
                arr2.remove(arr2.size()-1);
                ListNode c = merge(a,b);
                arr2.add(c);
            }
            if(arr2.size()==1){
                arr1.add(arr2.get(0));
                arr2.remove(0);
            }
        }
        if(arr1.size()==0){
            return arr2.get(0);
        }
        return arr1.get(0);
    }
}
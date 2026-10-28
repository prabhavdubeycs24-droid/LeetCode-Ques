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
    public ListNode modifiedList(int[] arr, ListNode head) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy ;
        ListNode t1 = head ; 
        while(t1!=null){
            if(set.contains(t1.val)){
                t1=t1.next;
            }
            else{
                temp.next=t1;
                temp=temp.next;
                t1=t1.next;
            }
            
        }
        temp.next=null;
        return dummy.next ; 
    }
}
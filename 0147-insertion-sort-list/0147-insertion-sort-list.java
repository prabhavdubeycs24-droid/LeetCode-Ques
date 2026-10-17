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
    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head ;
        int size = 0;
        while(temp!=null){
            temp=temp.next;
            size++;
        }
        int[] arr = new int[size];
        temp = head ;
        int i=0;
        while(temp!=null){
            arr[i]=temp.val;
            temp=temp.next;
            i++;
        }
        Arrays.sort(arr);
        ListNode d = new ListNode(arr[0]);
        temp = d ;
        for(int j=1;j<size;j++){
            ListNode naya = new ListNode(arr[j]);
            temp.next=naya;
            temp=temp.next;
        }
        return d;
    }
}
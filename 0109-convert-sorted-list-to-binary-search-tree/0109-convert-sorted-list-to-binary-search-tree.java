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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static TreeNode helper(int low,int high , ArrayList<Integer> al){
        if(al.size()==0){
            return null ; 
        }
        if(low>high){
            return null;
        }
        int mid = low+(high-low)/2;
        TreeNode root = new TreeNode(al.get(mid));
        root.left = helper(low,mid-1,al);
        root.right=helper(mid+1,high,al);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null){
            return null;
        }
        ArrayList<Integer> al = new ArrayList<>();
        ListNode temp = head ;
        while(temp!=null){
            al.add(temp.val);
            temp=temp.next;
        }
        int low = 0;
        int high = al.size()-1;
        return helper(low,high,al);
    }
}
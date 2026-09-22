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
    public static void helper(TreeNode root, ArrayList<Integer> al){
        if(root==null){
            return;
        }
        helper(root.left,al);
        al.add(root.val);
        helper(root.right,al);
    }
    public static TreeNode helper1(ArrayList<Integer> al,int low , int high){
        if(low>high){
            return null ; 
        }
        int mid = low + (high-low)/2;
        TreeNode root = new TreeNode(al.get(mid));
        root.left=helper1(al,low,mid-1);
        root.right=helper1(al,mid+1,high);
        return root;
    }
    public TreeNode balanceBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        helper(root,al);
        return helper1(al,0,al.size()-1);
    }
}
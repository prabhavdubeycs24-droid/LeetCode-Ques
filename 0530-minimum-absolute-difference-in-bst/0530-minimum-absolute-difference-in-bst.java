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
    static int mindiff;
    static TreeNode prev;
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        if(prev!=null){
            mindiff=Math.min(mindiff,root.val-prev.val);
        }
        prev=root;
        helper(root.right);
        
    }
    public int getMinimumDifference(TreeNode root) {
        mindiff=Integer.MAX_VALUE;
        prev=null;
        helper(root);
        return mindiff;
    }
}
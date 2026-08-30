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
    public static int level(TreeNode root){
        if(root==null){
            return 0 ; 
        }
        return 1+Math.max(level(root.left),level(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true ; 
        }
        int l = level(root.left);
        int r = level(root.right);
        if(Math.abs(l-r)>1){
            return false;
        }
        if(isBalanced(root.left)==false || isBalanced(root.right)==false){
            return false ; 
        }
        return true; 
    }
}
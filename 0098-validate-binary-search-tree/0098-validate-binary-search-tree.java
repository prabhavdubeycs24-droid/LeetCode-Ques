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
    static TreeNode prev ;
    static boolean flag ; 
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.left);
        if(prev!=null && prev.val>=root.val){
            flag=false;
            return;
        }
        prev = root; 
        helper(root.right);
    }
    public boolean isValidBST(TreeNode root) {
        prev = null;
        flag=true;
        helper(root);
        return flag ; 

    }
}
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
    static int sum ;
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        if(root.left!=null){
            if(root.left.right==null && root.left.left==null){
                sum=sum+root.left.val;
            }
        }
        helper(root.left);
        helper(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left==null && root.right==null){
            return 0 ;
        }
        sum=0;
        helper(root);
        return sum ; 
    }
}
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
//we need reverse inorder as we need to print root.val+every greater element than it , so we go in reverse order(i.e) highest value first then maintain sum and keep updating and adding it to the next elements 
class Solution {
    static int sum ;
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        helper(root.right);
        
        sum=sum+root.val;
        root.val=sum;
        helper(root.left);
        
    }
    public TreeNode convertBST(TreeNode root) {
        sum =0;
        helper(root);
        return root;

    }
}
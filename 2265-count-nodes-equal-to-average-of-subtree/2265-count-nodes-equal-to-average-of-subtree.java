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
    public static  int retsum(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+retsum(root.left)+retsum(root.right);
    }
    public static int retcon(TreeNode root){
        if(root==null){
            return 0 ;
        }
        return 1+retcon(root.left)+retcon(root.right);
    }
    public static void helper(TreeNode root){
        if(root==null){
            return ;
        }
        int avg = (retsum(root)/retcon(root));
        if(avg==root.val){
            count++;
        }
        if(root.left!=null){
            helper(root.left);
        }
        if(root.right!=null){
            helper(root.right);
        }
    }
    static int count;
    public int averageOfSubtree(TreeNode root) {
        count = 0;
        helper(root);
        return count;

    }
}
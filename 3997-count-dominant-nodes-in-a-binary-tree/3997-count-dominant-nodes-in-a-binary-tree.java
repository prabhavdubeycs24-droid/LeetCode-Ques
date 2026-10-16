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
    public static int count ; 
    public static int max ; 
    public int  helper(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        int left = helper(root.left);
        int right = helper(root.right);
        if(Math.max(left,Math.max(right,root.val))==root.val){
            count++;
            
        }
        return Math.max(left,Math.max(right,root.val));
    }
    public int countDominantNodes(TreeNode root) {
        count = 0;
        max = Integer.MIN_VALUE;
        helper(root);
        return count ; 
    }
}
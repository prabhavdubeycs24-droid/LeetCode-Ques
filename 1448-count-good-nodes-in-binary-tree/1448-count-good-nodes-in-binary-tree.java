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
    static int count;
    public void helper(TreeNode root, int maxsofar){
        if(root==null){
            return;
        }
        if(root.val>=maxsofar){
            count++;
        }
        maxsofar=Math.max(maxsofar,root.val);
        helper(root.left,maxsofar);
        helper(root.right,maxsofar);
    }
    public int goodNodes(TreeNode root) {
        count = 0;
        helper(root,Integer.MIN_VALUE);
        return count ;
    }
}
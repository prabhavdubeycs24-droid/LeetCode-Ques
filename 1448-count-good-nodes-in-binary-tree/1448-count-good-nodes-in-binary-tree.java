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
 // just check that the node should be greater than max in the path from root to that node 
class Solution {
    static int count ; 
    public static void helper(TreeNode root ,int  maxSofar){
        if(root==null){
            return ; 
        }
        if(root.val>=maxSofar){
            count++;
        }
        maxSofar=Math.max(maxSofar,root.val);
        helper(root.left,maxSofar);
        helper(root.right,maxSofar);
    }
    public int goodNodes(TreeNode root) {
        count = 0;
        int maxSofar = Integer.MIN_VALUE;
        helper(root,maxSofar);
        return count ; 
    }
}
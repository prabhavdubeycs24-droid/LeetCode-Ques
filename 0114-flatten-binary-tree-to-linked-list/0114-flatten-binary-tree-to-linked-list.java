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
    public void flatten(TreeNode root) {
        if(root==null){
            return ;
        }
        TreeNode LST = root.left;
        TreeNode RST = root.right;
        root.left = root.right = null;
        flatten(LST);
        flatten(RST);
        root.right=LST;
        // now finding last element of LST 
        TreeNode last = root;
        while(last!=null && last.right!=null){
            last=last.right;
        }
        last.right=RST;
    }
}
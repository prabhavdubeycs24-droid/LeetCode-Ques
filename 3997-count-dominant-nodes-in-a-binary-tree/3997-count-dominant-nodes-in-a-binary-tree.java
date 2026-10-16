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
    public int getmax(TreeNode root){
        if(root==null){
            return Integer.MIN_VALUE;
        }
        return Math.max(root.val,Math.max(getmax(root.left),getmax(root.right)));
    }
    public static int count ;
    public void solve(TreeNode root){
        if(root==null){
            return;
        }
        if(root.val==getmax(root)){
            count++;
        }
        solve(root.left);
        solve(root.right);
    }
    public int countDominantNodes(TreeNode root) {
        if(root.left==null && root.right==null){
            return 1;
        }
        count = 0;
        solve(root);
        return count ;
    }
}
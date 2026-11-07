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
    static boolean flag ;
    static int data;
    public static void solve(TreeNode root){
        if(root==null){
            return;
        }
        if(data!=root.val){
            flag=false;
        }
        solve(root.left);
        solve(root.right);
    }
    public boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root!=null){
            data = root.val;
        }
        flag=true;
        solve(root);
        return flag;
    }
}
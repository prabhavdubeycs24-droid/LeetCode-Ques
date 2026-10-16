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
    public static boolean containsOne(TreeNode root){
        if(root==null){
            return false;
        }
        if(root.val==1){
            return true;
        }
        if(containsOne(root.left)==true || containsOne(root.right)==true){
            return true;
        }
        return false;
    }
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){
            return root;
        }
        if(!containsOne(root)){
            return null;
        }
        if(!containsOne(root.left)){
            root.left=null;
        }
        if(!containsOne(root.right)){
            root.right=null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        return root;
    }
}
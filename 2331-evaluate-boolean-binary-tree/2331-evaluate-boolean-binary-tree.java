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
    public boolean evaluateTree(TreeNode root) {
        if(root.left==null && root.right==null){
            if(root.val==1){
                return true;
            }
            return false;
        }
        boolean l = evaluateTree(root.left);
        boolean r = evaluateTree(root.right);

        if(root.val==2){
            if(l== false && r==false){
                return false;
            }
            return true;
        }
        else{
            if(l==true && r==true){
                return true;
            }
            return false;
        }
    }
}
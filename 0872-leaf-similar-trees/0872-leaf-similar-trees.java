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
    public void helper(TreeNode root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            al.add(root.val);
        }
        helper(root.left,al);
        helper(root.right,al);
    }
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        helper(root1,al1);
        helper(root2,al2);
        if(al1.size()!=al2.size()){
            return false;
        }
        return al1.equals(al2);
    }
}
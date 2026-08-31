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
    public static void helper(TreeNode root , ArrayList<TreeNode> arr){
        if(root==null){
            return;
        }
        arr.add(root);
        helper(root.left,arr);
        helper(root.right,arr);
    }
    public void flatten(TreeNode root) {
        ArrayList<TreeNode> arr = new ArrayList<>();
        helper(root,arr);
        for(int i =1;i<arr.size();i++){
            root.right=arr.get(i);
            root.left=null;
            root=root.right;
        }
        
    }
}
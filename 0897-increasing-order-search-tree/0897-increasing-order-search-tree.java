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
    public static void helper(TreeNode root,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        helper(root.left,al);
        al.add(root.val);
        helper(root.right,al);
    }
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        helper(root,al);
        TreeNode naya = new TreeNode(al.get(0));
        TreeNode temp = naya ;
        for(int i=1;i<al.size();i++){
            TreeNode nayanode = new TreeNode(al.get(i));
            temp.right=nayanode;
            temp=temp.right;
        }
        return naya ; 
    }
}
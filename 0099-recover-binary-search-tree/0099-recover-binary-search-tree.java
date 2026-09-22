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
    public static void helper(TreeNode root , ArrayList<TreeNode> al){
        if(root==null){
            return ;
        }
        helper(root.left,al);
        al.add(root);
        helper(root.right,al);
    }
    public void recoverTree(TreeNode root) {
        ArrayList<TreeNode> al = new ArrayList<>();
        helper(root,al);
        TreeNode temp1 = null;
        TreeNode temp2 = null;
        int i =1;
        while(i<al.size()){
            if(al.get(i).val<al.get(i-1).val){
                if(temp1==null){
                    temp1=al.get(i-1);
                }
                temp2=al.get(i);
            }
            i++;
        }
        int temp = temp1.val;
        temp1.val = temp2.val;
        temp2.val=temp;

        return;
        
    }
}
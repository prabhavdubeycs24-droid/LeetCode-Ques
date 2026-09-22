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
    public static void helper(TreeNode root , ArrayList<Integer> al){
        if(root==null){
            return ;
        }
        helper(root.left,al);
        al.add(root.val);
        helper(root.right,al);
    }
    public boolean findTarget(TreeNode root, int k) {
        ArrayList<Integer> al = new ArrayList<>();
        helper(root,al);
        int i =0;
        int j = al.size()-1;
        while(i<j){
            if(al.get(i)+al.get(j)==k){
                return true;
            }
            else if(al.get(i)+al.get(j)>k){
                j--;
            }
            else{
                i++;
            }
        }
        return false ; 
    }
}
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
    public static void helper(TreeNode root, ArrayList<Integer> al , List<List<Integer>> ans,int k){
        if(root==null){
            return;
        }
        al.add(root.val);
        if(root.left==null && root.right==null){
            if(k==root.val){
                ans.add(new ArrayList<>(al));
            }
        }
        helper(root.left,al,ans,k-root.val);
        helper(root.right,al,ans,k-root.val);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>() ;
        helper(root,al,ans,targetSum);
        return ans ; 
    }
}
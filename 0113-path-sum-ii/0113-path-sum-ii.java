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
    public static void helper(List<List<Integer>> ans , ArrayList<Integer> al , TreeNode root , int targetSum){
        if(root==null){
            return;
        }
        al.add(root.val);
        if(root.left==null && root.right==null){
            if(targetSum==root.val){
                ans.add(new ArrayList<>(al));
            }
        }
        helper(ans,al,root.left,targetSum-root.val);
        helper(ans,al,root.right,targetSum-root.val);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        helper(ans,al,root,targetSum);
        return ans ; 
    }
}
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
    public static void helper(TreeNode root,int target,List<List<Integer>> ans,ArrayList<Integer> al){
        if(root==null){
            return;
        }
        al.add(root.val);
        if(root.left==null && root.right==null){
            if(root.val==target){
                ans.add(new ArrayList<>(al));
            }
        }
        helper(root.left,target-root.val,ans,al);
        helper(root.right,target-root.val,ans,al);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> al = new ArrayList<>();
        helper(root,targetSum,ans,al);
        return ans ; 
    }
}
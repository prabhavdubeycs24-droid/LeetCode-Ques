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
        al.add(root.val);
        helper(root.left,al);
        helper(root.right,al);
    }
    public int findSecondMinimumValue(TreeNode root) {
        ArrayList<Integer> al = new ArrayList<>();
        helper(root,al);
        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;
        for(int i=0;i<al.size();i++){
            int val = al.get(i);
            if(val<min1){
                min2=min1;
                min1=val;
            }
            else if(val>min1 && val<min2){
                min2=val;
            }
        }
        if(min2==Long.MAX_VALUE){
            return -1;
        }
        return (int)min2;
    }
}
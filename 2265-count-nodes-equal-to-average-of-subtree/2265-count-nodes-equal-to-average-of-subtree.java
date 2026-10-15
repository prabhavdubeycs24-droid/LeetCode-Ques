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
    static int count ;
    public static int[] helper(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] left = helper(root.left);
        int[] right = helper(root.right);

        int sum = root.val+left[0]+right[0];
        int countnod =1+ left[1]+right[1];
        if((sum/countnod)==root.val){
            count++;
        }
        return new int[]{sum,countnod};
    }
    public int averageOfSubtree(TreeNode root) {
        count  = 0;
        helper(root);
        return count ; 
    }
}
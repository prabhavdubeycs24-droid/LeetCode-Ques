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
 // INorder of bst is in increasing order 
class Solution {
    static int count ;
    static int answer ;
    public static void helper(TreeNode root , int k ){
        if(root==null){
            return  ;
        }
        helper(root.left,k);
        count--;
        if(count==0){
            answer=root.val;
        }
        helper(root.right,k);

    }
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        answer = -1 ; 
        helper(root,k);
        return answer ;
    }
}
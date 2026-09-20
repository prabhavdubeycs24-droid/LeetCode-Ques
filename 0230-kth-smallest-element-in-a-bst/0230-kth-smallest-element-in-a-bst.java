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
        if(answer!=-1){
            return;
        }
        if(count==k){
            answer = root.val;
            return;
        }
        count++;
        helper(root.right,k);

    }
    public int kthSmallest(TreeNode root, int k) {
        count = 1;
        answer = -1 ; 
        helper(root,k);
        return answer ;
    }
}
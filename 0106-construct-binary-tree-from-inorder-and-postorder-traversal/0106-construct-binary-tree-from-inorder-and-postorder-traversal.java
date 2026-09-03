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
    public static TreeNode helper(int inlow,int inhigh,int postlow,int posthigh,int[] inorder,int[] postorder){
        if(postlow>posthigh || inlow>inhigh){
            return null;
        }
       TreeNode root = new TreeNode(postorder[posthigh]);
       //locating root in inorder 
       int r = -1 ;
       for(int i =inlow;i<=inhigh;i++){
        if(inorder[i]==root.val){
            r=i;
            break;
        }
       }
       int count = r - inlow ;
       root.left = helper(inlow,r-1,postlow,postlow+count-1,inorder,postorder);
       root.right = helper(r+1,inhigh,postlow+count,posthigh-1,inorder,postorder);
       return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n = postorder.length;
        return helper(0,n-1,0,n-1,inorder , postorder);
    }
}
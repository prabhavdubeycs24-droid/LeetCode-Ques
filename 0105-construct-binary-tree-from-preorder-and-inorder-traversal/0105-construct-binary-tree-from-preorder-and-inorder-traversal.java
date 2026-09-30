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
    public static TreeNode helper(int prelow,int prehigh,int inlow,int inhigh,int[]inorder,int[]preorder){
        if(prelow>prehigh || inlow>inhigh){
            return null ;
        }
        TreeNode root = new TreeNode(preorder[prelow]);
        int r=-1;
        for(int i=inlow;i<=inhigh;i++){
            if(inorder[i]==root.val){
                r=i;
                break;
            }
        }
        // count means left 
        int count = r-inlow;
        root.left=helper(prelow+1,prelow+count ,inlow,r-1,inorder,preorder);
        root.right=helper(prelow+count+1,prehigh,r+1,inhigh,inorder,preorder);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n = preorder.length;
        int prelow=0;
        int prehigh=n-1;
        int inlow=0;
        int inhigh=n-1;
        return helper(prelow,prehigh,inlow,inhigh,inorder , preorder);
    }
}
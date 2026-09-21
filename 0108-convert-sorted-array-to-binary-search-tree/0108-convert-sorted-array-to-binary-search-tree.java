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
    public TreeNode helper(int[] arr , int low , int high){
        if(low>high){
            return null;
        }
        int mid = low + ((high-low)/2);
        TreeNode root = new TreeNode(arr[mid]);
        root.left = helper(arr,low,mid-1);
        root.right = helper(arr,mid+1,high);
        return root ;
    }
    public TreeNode sortedArrayToBST(int[] arr) {
        if(arr.length==0){
            return null;
        }
        int n = arr.length;
        return helper(arr,0,n-1);//middle will be the root, root of LST be will middle of left half , same for right , similarly get the tree recursively 
    }
}
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
    public static void helper(TreeNode root , ArrayList<String> al , StringBuilder sb){
        if(root==null){
            return;
        }
        sb.append(root.val);
        if(root.left==null && root.right==null){
            al.add(sb.toString());
        }
        
        helper(root.left,al,sb);
        helper(root.right,al,sb);
        sb.deleteCharAt(sb.length()-1); // backtrack iss point se 
    }
    public int sumNumbers(TreeNode root) {
        ArrayList<String> al = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(root,al,sb);
        int sum = 0;
        for(int i=0;i<al.size();i++){
            sum=sum+Integer.parseInt(al.get(i));
        }
        return sum ; 
    }
}
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
    public static void helper(TreeNode root , List<List<Integer>> ans , ArrayList<Integer> al,Queue<TreeNode> q){
        if(q.size()==0){
            return;
        }
        q.add(root);
        TreeNode ele = q.remove();
        al.add(ele.val);
        q.add(ele.left);
        q.add(ele.right);
        helper(root.left,ans,al,q);
        helper(root.right,ans,al,q);
        
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null){
            return ans ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int lvl = q.size();
            ArrayList<Integer> al = new ArrayList<>();
            for(int i=0;i<lvl;i++){
                TreeNode ele = q.remove();
                al.add(ele.val);
                if(ele.left!=null){
                    q.add(ele.left);
                }
                if(ele.right!=null){
                    q.add(ele.right);
                }
            }
            ans.add(al);

        }
        return ans ; 
    }
}
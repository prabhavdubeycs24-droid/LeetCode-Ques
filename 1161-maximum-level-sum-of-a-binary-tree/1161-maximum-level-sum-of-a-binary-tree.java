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
    public int maxLevelSum(TreeNode root) {
        if(root.left==null && root.right==null){
            return 1 ;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int maxsum = Integer.MIN_VALUE;
        int level = 1;
        int anslevel = 0 ;
        while(q.size()!=0){
            int sum = 0;
            int lvl = q.size();
            for(int i=0;i<lvl;i++){
                TreeNode temp = q.remove();
                sum = sum + temp.val;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
                
            }
            if(sum>maxsum){
                maxsum=sum;
                anslevel=level;
            }
            level++;
        }
        return anslevel ; 
    }
}
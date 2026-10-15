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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth==1){
            TreeNode naya = new TreeNode (val);
            naya.left = root;
            return naya;
        }
        int currdepth = 1;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
            int lvl = q.size();
            for(int i=0;i<lvl;i++){
                TreeNode temp = q.remove();
                if(currdepth==depth-1){
                        TreeNode save1 = temp.left ;
                        TreeNode save2 = temp.right;
                        TreeNode naya1  = new TreeNode(val);
                        TreeNode naya2 = new TreeNode(val);
                        temp.left = naya1 ;
                        temp.right = naya2;
                        TreeNode temp1=temp.left;
                        TreeNode temp2=temp.right;
                        temp1.left=save1;
                        temp2.right=save2;
                }
                else{
                    if(temp.left!=null){
                        q.add(temp.left);
                    }
                    if(temp.right!=null){
                        q.add(temp.right);
                    }
                }
            }
            if(currdepth==depth-1){
                return root;
            }
            currdepth++;
        }
        return root; 
    }
}
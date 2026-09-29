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
class pair{
    TreeNode root ;
    int idx ;
    pair(TreeNode root , int idx){
        this.root=root;
        this.idx=idx;
    }
}
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if(root.left==null && root.right==null){
            return 1 ; 
        }
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root,1));
        int maxwid=0;
        int last = -1;
        int first = -1;
        while(q.size()!=0){
            int lvl = q.size();
            first = q.peek().idx;
            for(int i=0;i<lvl;i++){
                
                pair p = q.remove();
                TreeNode temp = p.root;
                int idx = p.idx;
                last = idx;
                if(temp.left!=null){
                    q.add(new pair(temp.left,2*idx));
                }
                if(temp.right!=null){
                    q.add(new pair(temp.right,2*idx+1));
                }
                
            }
            maxwid = Math.max(maxwid,last-first+1);
        }
        return maxwid;
    }
}
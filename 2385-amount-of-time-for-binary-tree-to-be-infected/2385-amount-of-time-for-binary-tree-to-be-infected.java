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
    TreeNode root;
    int dist;
    pair(TreeNode root,int dist){
        this.root=root;
        this.dist=dist;
    }
}
class Solution {
    static TreeNode startNode ; 
    public static void helper(TreeNode root , HashMap<TreeNode,TreeNode> map,int start,HashMap<TreeNode,Boolean> visit){
        if(root==null){
            return;
        }
        visit.put(root,false);
        if(root.val==start){
            startNode = root;
        }
        if(root.left!=null){
            map.put(root.left,root);
        }
        if(root.right!=null){
            map.put(root.right,root);
        }
        helper(root.left,map,start,visit);
        helper(root.right,map,start,visit);
    }
    public int amountOfTime(TreeNode root, int start) {
        if(root.left==null&&root.right==null){
            return 0 ; 
        }
        HashMap<TreeNode,TreeNode> map = new HashMap();
        HashMap<TreeNode,Boolean> visit = new HashMap();
        startNode = null ; 
        helper(root,map,start,visit);
        visit.put(startNode,true);
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(startNode,0));
        int max = 0 ; 
        while(q.size()!=0){
            int lvl = q.size();
            for(int i=0;i<lvl;i++){
                pair p = q.remove();
                TreeNode temp = p.root;
                int d = p.dist;
                max=Math.max(d,max);
                if(temp.left!=null && !visit.get(temp.left)){
                    q.add(new pair(temp.left,d+1));
                    visit.put(temp.left,true);
                }
                if(temp.right!=null && !visit.get(temp.right)){
                    q.add(new pair(temp.right,d+1));
                    visit.put(temp.right,true);
                }
                if(map.get(temp)!=null && !visit.get(map.get(temp))){
                    q.add(new pair(map.get(temp),d+1));
                    visit.put(map.get(temp),true);
                }
            }
        }
        return max ; 

    }
}
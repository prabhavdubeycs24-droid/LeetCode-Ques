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
class triplet{
    TreeNode root ;
    int col;
    int lvl;
    triplet(TreeNode root,int col,int lvl){
        this.root=root;
        this.col=col;
        this.lvl=lvl;
    }
}
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer , ArrayList<int []>> map = new HashMap();
        Queue<triplet> q = new LinkedList<>();
        q.add(new triplet(root,0,0));
        while(q.size()!=0){
            int lvl = q.size();
            for(int i=0;i<lvl;i++){
                triplet t = q.remove();
                int r = t.col;
                int l = t.lvl;
                TreeNode temp = t.root;
                if(!map.containsKey(r)){
                    map.put(r,new ArrayList<int[]>());
                }
                map.get(r).add(new int[]{l,temp.val});
                if(temp.left!=null){
                    q.add(new triplet(temp.left,r-1,l+1));
                }
                if(temp.right!=null){
                    q.add(new triplet(temp.right,r+1,l+1));
                }
            }
        }
        ArrayList<Integer> cols = new ArrayList<>();
        for(int c:map.keySet()){
            cols.add(c);
        }
        Collections.sort(cols);
        for(ArrayList<int[]> al : map.values()){
            Collections.sort(al,(a,b)->{
                if(a[0]!=b[0]){ // based on col 
                    return a[0]-b[0];
                }
                return a[1]-b[1]; // based on values 
            });
        }
        for(int coll : cols){
            ArrayList<Integer> al = new ArrayList<>();
            for(int[] x : map.get(coll)){
                al.add(x[1]);
            }
            ans.add(new ArrayList<>(al));
        }
        return ans ; 
    }
}
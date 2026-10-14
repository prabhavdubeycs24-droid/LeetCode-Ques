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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> al = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        //al.add((double)root.val);
        while(q.size()!=0){
            int lvl = q.size();
            int totnod = 0;
            long sum = 0;
            for(int i=0;i<lvl;i++){
                TreeNode temp = q.remove();
                sum=sum+(long)temp.val;
                totnod++;
                if(temp.left!=null){
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    q.add(temp.right);
                }
            }
            if(totnod==0){
                continue;
            }
            else{
                double avg = (double)sum/(double)totnod;
                al.add(avg);
            }
            
        }
        return al ;
    }
}
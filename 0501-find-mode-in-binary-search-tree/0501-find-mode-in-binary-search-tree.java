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
    public static void helper(TreeNode root , HashMap<Integer,Integer> map){
        if(root==null){
            return ;
        }
        if(map.containsKey(root.val)){
            int f = map.get(root.val);
            map.put(root.val,f+1);
        }
        else{
            map.put(root.val,1);
        }
        helper(root.left,map);
        helper(root.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap();
        helper(root,map);
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        for(int ele : map.keySet()){
            max=Math.max(max,map.get(ele));
        }
        for(int ele : map.keySet()){
            if(map.get(ele)==max){
                al.add(ele);
            }
        }
        int[] arr = new int[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i]=al.get(i);
        }
        return arr ; 
    }
}
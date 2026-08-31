/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 // all r uniqueee
class Solution {
    public static boolean exist(TreeNode root , int val){
        if(root==null){
            return false;
        }
        if(root.val==val){
            return true;
        }
        if(exist(root.left,val)==true || exist(root.right,val)==true){
            return true;
        }
        return false;
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
            return null;
        }
        if(p.val==root.val || q.val==root.val){
            return root;
        }
        // 3 case dono diff LST aur RST , dono LST , ya fhir dono RST 
        if((exist(root.left,p.val) && exist(root.right,q.val))||(exist(root.left,q.val) && exist(root.right,p.val))){
            return root;
        }
        else if(exist(root.left,p.val) && exist(root.left,q.val)){
            return lowestCommonAncestor(root.left,p,q);
        }
        else{
            return lowestCommonAncestor(root.right,p,q);
        }

    }
}//what if regardless of the constraint one of the node is not present in the tree, then what ans ?
//"the present node will be the answer"
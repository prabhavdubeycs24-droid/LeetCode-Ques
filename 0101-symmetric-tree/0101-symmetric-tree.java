class Solution {
    public static boolean isIdentical(TreeNode root1 , TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        if(root1==null || root2==null){
            return false ;
        }
        if(root1.val!=root2.val){
            return false;
        }
        if(isIdentical(root1.left,root2.left)==false){
            return false;
        }
        if(isIdentical(root1.right,root2.right)==false){
            return false;
        }
        return true ; 
    }
    public static void  mirror(TreeNode root){
        if(root==null) return  ; 
        TreeNode temp = root.left;
        root.left=root.right;
        root.right=temp;
        mirror(root.left);
        mirror(root.right);
    }
    public boolean isSymmetric(TreeNode root) {
        mirror(root.left);
        if(isIdentical(root.left,root.right)==false){
            return false;
        }
        return true;
    }
}
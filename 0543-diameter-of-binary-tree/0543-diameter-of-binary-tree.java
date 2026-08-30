class Solution {
    public static int level(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(level(root.left),level(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0 ; 
        }
        int a = level(root.left)+level(root.right);
        int b = diameterOfBinaryTree(root.left);
        int c = diameterOfBinaryTree(root.right);

        return Math.max(a,Math.max(b,c));
    }
}
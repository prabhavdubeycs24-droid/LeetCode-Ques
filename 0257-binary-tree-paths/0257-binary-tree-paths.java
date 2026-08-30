class Solution {
    public static void helper(TreeNode root ,String path, ArrayList<String> arr){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            arr.add(path);
        }
        if(root.left!=null){
            helper(root.left,path+"->"+root.left.val,arr);
        }
        if(root.right!=null){
            helper(root.right,path+"->"+root.right.val,arr);
        }

    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
        String path=""; 
        path = String.valueOf(root.val);
        helper(root,path,arr);
        return arr ; 
    }
}
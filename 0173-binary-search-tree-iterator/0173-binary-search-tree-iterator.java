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
class BSTIterator {
    Stack<TreeNode> st = new Stack<>();
    public BSTIterator(TreeNode root) {
        TreeNode temp = root; 
        while(temp!=null){
            st.push(temp);
            temp=temp.left;
        }
    }
    
    public int next() {
        TreeNode temp = st.pop();
        int ans = temp.val;
        temp=temp.right;
        while(temp!=null){
            st.push(temp);
            temp=temp.left;
        }
        return ans ; 
    }
    
    public boolean hasNext() {
        if(st.size()==0){
            return false;
        }
        return true;
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
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

    public void inorder(TreeNode root, ArrayList<Integer> al) {
        if (root == null) {
            return;
        }

        inorder(root.left, al);
        al.add(root.val);
        inorder(root.right, al);
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {

        ArrayList<Integer> al = new ArrayList<>();
        inorder(root, al);

        List<List<Integer>> ans = new ArrayList<>();

        for (int q : queries) {

            int low = 0;
            int high = al.size() - 1;

            int floor = -1;
            int ceil = -1;

            while (low <= high) {

                int mid = low + (high - low) / 2;

                if (al.get(mid) == q) {
                    floor = q;
                    ceil = q;
                    break;
                }

                if (al.get(mid) < q) {
                    floor = al.get(mid);
                    low = mid + 1;
                } 
                else {
                    ceil = al.get(mid);
                    high = mid - 1;
                }
            }

            ans.add(Arrays.asList(floor, ceil));
        }

        return ans;
    }
}
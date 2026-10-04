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
import java.util.*;

class pair {
    TreeNode root;
    int col;
    pair(TreeNode root, int col) {
        this.root = root;
        this.col = col;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        Queue<pair> q = new LinkedList<>();
        q.add(new pair(root, 0));
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while (q.size() != 0) {
            int lvl = q.size();
            
            // 1. Create a subMap to temporarily store nodes ONLY on the current level/row
            HashMap<Integer, ArrayList<Integer>> subMap = new HashMap<>();

            for (int i = 0; i < lvl; i++) {
                pair p = q.remove();
                TreeNode temp = p.root;
                int col = p.col;

                if (!subMap.containsKey(col)) {
                    subMap.put(col, new ArrayList<Integer>());
                }
                subMap.get(col).add(temp.val);
                
                max = Math.max(max, col);
                min = Math.min(min, col);

                if (temp.left != null) {
                    q.add(new pair(temp.left, col - 1));
                }
                if (temp.right != null) {
                    q.add(new pair(temp.right, col + 1));
                }
            }

            // 2. Sort ONLY the overlapping values on the same row-column coordinate
            for (int col : subMap.keySet()) {
                Collections.sort(subMap.get(col));
                
                // 3. Append these sorted row items safely into the main vertical map
                if (!map.containsKey(col)) {
                    map.put(col, new ArrayList<>());
                }
                map.get(col).addAll(subMap.get(col));
            }
        }

        // 4. Populate your final answer list from min column to max column
        for (int i = min; i <= max; i++) {
            ans.add(map.get(i));
        }
        
        return ans; 
    }
}

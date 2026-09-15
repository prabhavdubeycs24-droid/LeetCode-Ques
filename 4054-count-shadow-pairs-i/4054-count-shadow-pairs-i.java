class Solution {
    public long shadowPairs(int[] nums) {
        int n = nums.length;
        long totalPairs = 0;
        ArrayList<Integer> stack = new ArrayList<>();
        
        for (int j = 0; j < n; j++) {
            while (!stack.isEmpty() && nums[stack.get(stack.size() - 1)] > nums[j]) {
                stack.remove(stack.size() - 1);
            }
            
            int low = 0;
            int high = stack.size() - 1;
            int validPairsForJ = 0;
            
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[stack.get(mid)] < nums[j]) {
                    validPairsForJ = mid + 1;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            
            totalPairs += validPairsForJ;
            stack.add(j);
        }
        
        return totalPairs;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hs = new HashMap<>();

        int diff = 0;

        for (int i = 0; i < nums.length; i++) {
            // diff = Math.abs(nums[i] - target);
            diff = target - nums[i];

            if (hs.containsKey(diff)) {
                return new int[] {hs.get(diff), i};
            }

            hs.put(nums[i], i);
        }
        return new int[] {};
    }
}

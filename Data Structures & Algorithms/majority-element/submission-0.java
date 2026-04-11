class Solution {
    public int majorityElement(int[] nums) {
        // moore's voting algorithm
        int votes = 0;
        int candidate = -1;

        for(int i = 0; i < nums.length; i++){
            if(votes == 0){
                candidate = nums[i];
                votes++;
            }else if(nums[i] == candidate) votes++;
            else votes--;
        }

        int count = 0;
        for(int num: nums){
            if(num == candidate) count++;
        }

        return count > nums.length / 2 ? candidate : -1;
    }
}
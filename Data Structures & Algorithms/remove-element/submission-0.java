class Solution {
    public int removeElement(int[] nums, int val) {
        int countVal = 0;
        for(int i = 0, k = 0; i < nums.length; i++){
            if(nums[i] == val){
                countVal++;
                continue;
            } 
            nums[k++] = nums[i];
        }
        return nums.length - countVal;
    }
}
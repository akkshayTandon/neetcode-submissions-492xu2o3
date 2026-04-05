class Solution {
    public int[] getConcatenation(int[] nums) {
        int newLength = nums.length + nums.length;
        int[] result = new int[newLength];
        int index = 0;

        for(int i = 1; i <= 2; i++){
            for(int num: nums){
                result[index] = num;
                index++;
            }
        }
        return result;
    }
}
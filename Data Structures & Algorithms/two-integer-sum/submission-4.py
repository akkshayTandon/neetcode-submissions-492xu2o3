class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hs = {}
        diff = 0

        for i in range(0, len(nums)):
            diff = target - nums[i]

            if diff in hs:
                return [hs[diff], i]
            
            hs[nums[i]] = i

        return []

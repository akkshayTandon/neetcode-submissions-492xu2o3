class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # moore's voting algorithm
        votes = 0
        candidate = -1

        for i in range(len(nums)):
            if votes == 0:
                candidate = nums[i]
                votes += 1
            elif nums[i] == candidate:
                votes += 1
            else:
                votes -= 1
        
        count = 0
        for num in nums:
            if num == candidate:
                count += 1
        
        if count > len(nums) / 2:
            return candidate
        
        return - 1
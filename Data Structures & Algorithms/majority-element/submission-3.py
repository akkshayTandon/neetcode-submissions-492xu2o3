class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        # moore's voting algorithm

        votes = 0
        candidate = -1 

        for n in nums:
            if votes == 0:
                candidate = n
                votes += 1
            elif n == candidate:
                votes += 1
            else:
                votes -= 1
        
        count = 0
        for n in nums:
            if n == candidate:
                count += 1
        
        if count > len(nums) / 2:
            return candidate
        
        return -1
class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count_val = 0
        n = len(nums)
        k = 0

        for i in range(0, n):
            if nums[i] == val:
                count_val += 1
                continue
            
            nums[k] = nums[i]
            k += 1
        
        return n - count_val
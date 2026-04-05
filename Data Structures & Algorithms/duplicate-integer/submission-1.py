class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        hs = set(nums)
        return len(hs) != len(nums)
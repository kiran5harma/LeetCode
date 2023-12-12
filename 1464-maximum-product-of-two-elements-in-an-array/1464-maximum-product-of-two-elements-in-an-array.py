class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        nums.sort()
        i,j = nums[:-3:-1]
        return (i-1)*(j-1)
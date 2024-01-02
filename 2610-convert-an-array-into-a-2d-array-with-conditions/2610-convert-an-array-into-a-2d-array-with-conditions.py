class Solution:
    def findMatrix(self, nums: List[int]) -> List[List[int]]:
        d={}
        for i in nums:
             d[i] = d.get(i,0)+1
        
        ans =[]
        
        while d:
            temp = []
            for k,v in list(d.items()):
                temp.append(k)
                v = v-1
                d[k] = v
                if v==0:
                    del d[k]
            ans.append(temp)
        return ans
        
    # WORST APPROCH .. Do loop laga k kya socha tha ..chutiya
        # while nums:
        #     temp = []
        #     i = 0
        #     while i<len(nums):
        #         print(nums)
        #         if nums[i] not in temp:
        #             temp.append(nums[i])
        #             nums.remove(nums[i])
        #         else:
        #             i+=1
        #     ans.append(temp)
        # return ans
        
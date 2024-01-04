class Solution:
    def minOperations(self, nums: List[int]) -> int:
        d={}
        for i in nums:
            d[i] = d.get(i,0)+1
        ans = 0
        for k,v in d.items():
            if v==1:
                return -1
            v3 = v%3
            
            if v3==1:
                ans+= v//3 + 1
            elif v3==0:
                ans+= v//3
            elif v3==2:
                ans+= v//3 + 1
            else:
                return -1
                
        return ans
class Solution:
    def largestOddNumber(self, num: str) -> str:
        ans=""
        i = len(num)
        while(i!=0):
            i-=1
            if(int(num[i])%2==1):
                ans = num[0:i+1]
                return ans
        return ans
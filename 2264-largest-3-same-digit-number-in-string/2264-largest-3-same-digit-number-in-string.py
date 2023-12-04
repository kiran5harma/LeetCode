class Solution:
    def largestGoodInteger(self, num: str) -> str:
        ans=""
        for i in range(9,-1,-1):
            istr = str(i)
            temp = num.count(istr)
            if temp>=3:
                ans = istr*3
                # print(ans)
                n = num.count(ans)
                if(n>=1):
                    return ans
                else:
                    continue
        return ""
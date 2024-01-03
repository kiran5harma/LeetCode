class Solution:
    def romanToInt(self, s: str) -> int:
        d={'I':[1,1],'V':[2,5],'X':[3,10],'L':[4,50],'C':[5,100],'D':[6,500],'M':[7,1000]}
        prev = d.get(s[0])
        ans = 0
        for i in range(1,len(s)):
            temp = d.get(s[i])
            if prev[0] < temp[0]:
                ans+= -prev[1]
            else:
                ans+= prev[1]
            prev = temp
        ans += prev[1]
        return ans
        
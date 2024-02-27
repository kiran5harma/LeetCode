class Solution:
    def myAtoi(self, s: str) -> int:
        ans = ""
        s = s.lstrip()
        flag = False
        sign = ""
        for i in range(len(s)):
            try:
                if (i == 0 and( s[i]=='-' or s[i]=='+' )) and flag==False:
                    flag= True 
                    sign = s[i]
                else:
                    int(s[i])
                    ans+=s[i]
            except:
                break
        if ans:
            if sign == '-':
                ans = -int(ans)
            else:
                ans = int(ans)
        else:
            ans = 0
        if ans < -2147483648:
            ans = -2147483648
        if ans> 2147483647:
            ans = 2147483647
        return ans
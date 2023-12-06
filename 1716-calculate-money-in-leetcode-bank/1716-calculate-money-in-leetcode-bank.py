class Solution:
    def totalMoney(self, n: int) -> int:
        if(n<=7):
            ans  = n*(n+1)//2
            return ans
        i = 0
        ans=0
        par = n%7
        ful = n//7
        l=[]
        for i in range(ful):
            # print(range(i+1,8+i))
            l = list(map(int,range(i+1,8+i)))
            ans += sum(l)
        # print(range(i+2,par+i+1))
        l = list(map(int,range(i+2,par+i+2)))
        ans += sum(l)
        return int(ans)
class Solution:
    def check(self,d,c,i):
        if d.get(c) == None:
            d[c]=i
            return i
        else:
            val = d.get(c)
            d[c]=i
            return val
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        ds ={}
        dt ={}
        for i in range(len(s)):
            if self.check(ds,s[i],i) != self.check(dt,t[i],i):
                return False
            
        return True
        
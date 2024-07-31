class Solution:
    def scoreOfString(self, sun: str) -> int:
        ans = 0
        for s in range(1,len(sun)):
            ans += abs(ord(sun[s])-ord(sun[s-1]))
        return ans
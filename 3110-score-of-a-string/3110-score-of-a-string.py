class Solution:
    def scoreOfString(self, sun: str) -> int:
        first = ord(sun[0])
        ans = 0
        for s in sun[1:]:
            s = ord(s)
            ans += abs(s-first)
            first = s
        return ans
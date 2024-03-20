class Solution:
    def numJewelsInStones(self, jewels: str, stones: str) -> int:
        c = 0
        for j in jewels:
            c+=stones.count(j)
        return c
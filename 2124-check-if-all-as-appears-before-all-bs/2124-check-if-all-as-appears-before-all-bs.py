class Solution:
    def checkString(self, s: str) -> bool:
        if s.count("ba"):
            return False
        else:
            return True
class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        num = ord(coordinates[0])+int(coordinates[1])
        return False if num%2 == 0 else True
        
        
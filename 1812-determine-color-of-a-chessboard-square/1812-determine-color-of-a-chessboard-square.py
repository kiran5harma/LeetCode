class Solution:
    def squareIsWhite(self, coordinates: str) -> bool:
        letter = ord(coordinates[0])
        num = int(coordinates[1])
        
        if letter%2 ==0:
            if num%2 == 0:
                return False
            else:
                return True
        else:
            if num%2 == 0:
                return True
            else:
                return False 
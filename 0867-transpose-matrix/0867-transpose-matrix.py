
class Solution:
    def transpose(self, matrix: List[List[int]]) -> List[List[int]]:
        row = len(matrix)
        col = len(matrix[0])
        ans=[]
        result = []
        for i in range(col):
            ans=[]
            for j in range(row):
                ans.append(matrix[j][i])
            result.append(ans)
        return result
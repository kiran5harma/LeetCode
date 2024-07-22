class Solution:
    def sortPeople(self, names: List[str], heights: List[int]) -> List[str]:
        h1 = heights.copy()
        heights.sort(reverse=True)
        ans=[]
        for i in range(len(h1)):
            ans.append(names[h1.index(heights[i])])
        return ans
        
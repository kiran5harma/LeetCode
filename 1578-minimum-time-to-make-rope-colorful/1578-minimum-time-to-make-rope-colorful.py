class Solution:
    def minCost(self, colors: str, neededTime: List[int]) -> int:
        count =0 
        for i in range(len(colors)-1):
            if colors[i] == colors[i+1]:
                # count+= neededTime[i] if neededTime[i] < neededTime[i+1] else neededTime[i+1]
                if neededTime[i] < neededTime[i+1]:
                    count+= neededTime[i]
                else:
                    count+= neededTime[i+1]
                    neededTime[i+1] = neededTime[i]
        return count
class Solution:
    def findSpecialInteger(self, arr: List[int]) -> int:
        per = len(arr)//4
        d={}
        for i in arr:
            if d.get(i) == None:
                d[i] = 1
            else:
                d[i]+=1
            if(d[i] > per):
                return i
        return 0
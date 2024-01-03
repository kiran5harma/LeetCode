class Solution:
    def numberOfBeams(self, bank: List[str]) -> int:
        d={}
        row = 0
        for i in bank:
            d[row] = i.count("1")
            row+=1
        # print(d)
        prev = 0
        ans = 0
        for k,v in d.items():
            if(prev!=0 and v!=0):
                ans+=prev*v
            if(v!=0):
                prev = v
        return ans
            
                
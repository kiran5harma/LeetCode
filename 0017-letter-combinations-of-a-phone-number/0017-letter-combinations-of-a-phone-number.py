class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        d ={"2":"abc","3":"def","4":"ghi","5":"jkl","6":"mno","7":"pqrs","8":"tuv","9":"wxyz"}
        result =[]
        for i in digits:
            num = d.get(i)
            if not result:
                for j in num:
                    result.append(j)
            else:
                temp = []
                for j in num:
                    for k in result:
                        temp.append(k+j)
                result = temp
        return result
                    
                
        
        
        
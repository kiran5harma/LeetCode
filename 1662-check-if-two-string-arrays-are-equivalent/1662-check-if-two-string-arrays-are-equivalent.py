class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        # w1=""
        # w2=""
        # for i in word1:
        #     w1 +=i
        # for i in word2:
        #     w2 +=i
        
        # w1 = ''.join(map(str,word1))
        # w2 = ''.join(map(str,word2))
        
        # w1 = ''.join(word1)
        # w2 = ''.join(word2)
        
        # print(w1,w2)
        # if (w1==w2):
        #     return True
        # else:
        #     return False
        
        # return w1==w2
        
        return ''.join(word1) == ''.join(word2)
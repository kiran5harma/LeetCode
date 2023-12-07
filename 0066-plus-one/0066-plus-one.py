class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        ans = []
#         carry =0
#         digits[-1] +=1
#         if(digits[-1]//10==0):
#             return digits
        
#         for i in digits[::-1]:
#             val = i%10+carry
#             ans.insert(0,val%10)
#             carry= i//10 + val//10
#         if(carry !=0 ):
#             ans.insert(0,carry)
        num = 0
        for i in digits:
            num = num*10 + i
        num +=1
        length = str(num)
        for i in length:
            ans.append(int(i))
        return ans
                
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
ans=""
def preorder(root):
    global ans
    if root == None:
        return ans
    
    ans+=str(root.val) 
    
    if root.left == None and root.right !=None:
        ans+="()"
    
    if root.left != None:
        ans+="("
        preorder(root.left)
        ans+=")" 
    
    if root.right !=None:
        ans+="("
        preorder(root.right)
        ans+=")" 
   
    return ans
        
class Solution:
    def tree2str(self, root: Optional[TreeNode]) -> str:
        kk=""
        global ans
        ans=""
        kk = preorder(root)
        # print(ans)
        return kk
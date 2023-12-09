# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
ans = []
def inorder(root):
    global ans
    if root == None:
        return ans
    if root.left != None:
        inorder(root.left)
    ans.append(root.val)
    if root.right != None:
        inorder(root.right)
    return ans
class Solution:
    
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        global ans
        ans=[]
        inorder(root)
        return ans
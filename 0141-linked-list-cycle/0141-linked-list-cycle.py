# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head == None:
            return False
        d={}
        current = head
        while current.next != None:
            if d.get(current):
                return True
            d[current] = True
            current = current.next
        return False
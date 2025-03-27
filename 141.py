# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if head == None: return False
        hashset = set()
        curr = head
        while True:
            if curr in hashset:
                return True
            if curr.next == None:
                return False
            hashset.add(curr)
            curr = curr.next

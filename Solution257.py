# 257. Binary Tree Paths
# Easy
# Topics
# Companies
# Given the root of a binary tree, return all root-to-leaf paths in any order.
# A leaf is a node with no children.
# Example 1:
# Input: root = [1,2,3,null,5]
# Output: ["1->2->5","1->3"]
# Example 2:
# Input: root = [1]
# Output: ["1"]
# Constraints:
# The number of nodes in the tree is in the range [1, 100].
# -100 <= Node.val <= 100

from typing import Optional, List
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right
class Solution:
    def binaryTreePaths(self, root: Optional[TreeNode]) -> List[str]:
        answer = []
        def recursion(curr: TreeNode, path: str, ans: List[str]):
            if curr.left == None and curr.right == None:
                ans.append(path)
                path = ""
            if curr.left != None:
                recursion(curr.left,  path + "->" + str(curr.left.val), answer)
            if curr.right != None:
                recursion(curr.right, path + "->" + str(curr.right.val), answer)
            # return ans
        recursion(root, str(root.val), answer)
        return answer
s = Solution()
one = TreeNode(1)
two = TreeNode(2)
three = TreeNode(3)
five = TreeNode(5)
six = TreeNode(6)
one.left = two
one.right = three
two.right = five
three.left = six
ans = s.binaryTreePaths(one)
print(ans)
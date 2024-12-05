// 104. Maximum Depth of Binary Tree

// Given the root of a binary tree, return its maximum depth.

// A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class Solution104 {
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        return recursion(root, 0);
    }

    static int recursion(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            return 1;
        }
        int left = 0;
        int right = 0;
        if (node.left != null) {
            left = recursion(node.left, depth) + 1;
        }
        if (node.right != null) {
            right = recursion(node.right, depth) + 1;
        }
        if (left > right)
            return left;
        else
            return right;
    }

    public static void main(String[] args) {
        TreeNode head = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        System.out.println(maxDepth(head));
    }
}
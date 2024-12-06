// 872. Leaf-Similar Trees
// Easy
// Topics
// Companies
// Consider all the leaves of a binary tree, from left to right order, the values of those leaves form a leaf value sequence.

// For example, in the given tree above, the leaf value sequence is (6, 7, 4, 9, 8).

// Two binary trees are considered leaf-similar if their leaf value sequence is the same.

// Return true if and only if the two given trees with head nodes root1 and root2 are leaf-similar.

import java.util.ArrayList;

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

class Solution872 {
    public static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null && root2 != null)
            return false;
        if (root1 != null && root2 == null)
            return false;
        if (root1 == null && root2 == null)
            return true;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1 = recursion(root1, arr1);
        arr2 = recursion(root2, arr2);
        return arr1.equals(arr2);
    }

    static ArrayList<Integer> recursion(TreeNode node, ArrayList<Integer> arr) {
        if (node.left != null) {
            recursion(node.left, arr);
        }
        if (node.right != null) {
            recursion(node.right, arr);
        }
        if (node.left == null && node.right == null)
            arr.add(node.val);
        return arr;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(2, new TreeNode(7), new TreeNode(4))),
                new TreeNode(1, new TreeNode(9), new TreeNode(8)));
        TreeNode root2 = new TreeNode(3,
                new TreeNode(5, new TreeNode(6), new TreeNode(7)),
                new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(9), new TreeNode(8))));
        System.out.println(leafSimilar(root1, root2));
    }
}
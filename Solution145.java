// Given the root of a binary tree, return the postorder traversal of its nodes' values.

// Example 1:

// Input: root = [1,null,2,3]

// Output: [3,2,1]

// Explanation:

// Example 2:

// Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]

// Output: [4,6,7,5,2,9,8,3,1]

// Explanation:

// Example 3:

// Input: root = []

// Output: []

// Example 4:

// Input: root = [1]

// Output: [1]

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

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

public class Solution145 {
    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        if (root == null)
            return arr;
        stack.push(root);
        TreeNode last = null;
        while (!stack.isEmpty()) {
            TreeNode temp = stack.peek();
            if (temp.right != null) {
                if (last == temp.right) {
                    // process
                    arr.add(temp.val);
                    last = stack.pop();

                    continue;
                }
                stack.push(temp.right);
            }
            if (temp.left != null) {
                if (last == temp.left) {
                    // process
                    arr.add(temp.val);
                    last = stack.pop();

                    continue;
                }
                stack.push(temp.left);
            }
            if (temp.left == null && temp.right == null) {
                // process
                arr.add(temp.val);
                last = stack.pop();
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        TreeNode one = new TreeNode(1);

        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        TreeNode nine = new TreeNode(9);
        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.right = eight;
        five.left = six;
        five.right = seven;
        eight.left = nine;

        System.out.println(postorderTraversal(one));
    }
}

// This question was tagged with two pointers in leetcode 75, but the solution includes sorting of the array, which i feel is such dumb thing to do.

// 1679. Max Number of K-Sum Pairs
// Medium
// Topics
// Companies
// Hint
// You are given an integer array nums and an integer k.

// In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.

// Return the maximum number of operations you can perform on the array.
// Example 1:

// Input: nums = [1,2,3,4], k = 5
// Output: 2
// Explanation: Starting with nums = [1,2,3,4]:
// - Remove numbers 1 and 4, then nums = [2,3]
// - Remove numbers 2 and 3, then nums = []
// There are no more pairs that sum up to 5, hence a total of 2 operations.
// Example 2:

// Input: nums = [3,1,3,4,3], k = 6
// Output: 1
// Explanation: Starting with nums = [3,1,3,4,3]:
// - Remove the first two 3's, then nums = [1,4,3]
// There are no more pairs that sum up to 6, hence a total of 1 operation.

import java.util.HashMap;
import java.util.HashSet;

class Solution1679 {

    public static int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= k) {
                if (map.containsKey(k - nums[i])) {
                    if (map.get(k - nums[i]) > 0) {
                        answer++;
                        map.put(k - nums[i], map.get(k - nums[i]) - 1);
                        continue;
                    }
                }
                map.putIfAbsent(nums[i], 0);
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2 };
        System.out.println(maxOperations(arr, 3));
    }
}
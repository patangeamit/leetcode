// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

// A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:

// Input: s = "abc", t = "ahbgdc"
// Output: true
// Example 2:

// Input: s = "axc", t = "ahbgdc"
// Output: false

public class Solution392 {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0)
            return true;
        int j = 0;
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
                if (j == s.length())
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence("", "ahbgdc"));
    }
}

// Given a string s, reverse only all the vowels in the string and return it.

// The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower
// and upper cases, more than once.

// Example 1:

// Input: s = "IceCreAm"

// Output: "AceCreIm"

// Explanation:

// The vowels in s are ['I', 'e', 'e', 'A']. On reversing the vowels, s becomes
// "AceCreIm".

// Example 2:

// Input: s = "leetcode"

// Output: "leotcede"

class Solution345 {
    public static String reverseVowels(String s) {
        StringBuilder sb = new StringBuilder();
        int left = 0;
        int right = s.length() - 1;
        while (left < s.length()) {
            char c = s.charAt(left);
            if (c == 'A' | c == 'E' | c == 'I' | c == 'O' | c == 'U' | c == 'a' | c == 'e' | c == 'i' | c == 'o'
                    | c == 'u') {
                while (0 <= right) {
                    char r = s.charAt(right);
                    if (r == 'A' | r == 'E' | r == 'I' | r == 'O' | r == 'U' | r == 'a' | r == 'e' | r == 'i' | r == 'o'
                            | r == 'u') {
                        sb.append(r);
                        right--;
                        break;
                    }
                    right--;
                }
                left++;
            } else {
                sb.append(c);
                left++;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("Euston saw I was not Sue."));
    }
}
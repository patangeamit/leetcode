// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// string convert(string s, int numRows);

// Example 1:

// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"
// Example 2:

// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:
// P     I    N
// A   L S  I G
// Y A   H R
// P     I
// Example 3:

// Input: s = "A", numRows = 1
// Output: "A"

public class Solution6 {

    public static String convert(String s, int numRows) {
        StringBuilder sb = new StringBuilder();
        if (numRows < 2)
            return s;
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            int one = 2 * (numRows - i) - 3;
            int two = 2 * (i) - 1;
            if (one == -1)
                one = two;
            if (two == -1)
                two = one;

            index = i;
            if (one == two) {
                while (index < s.length()) {
                    System.out.println(s.charAt(index));
                    sb.append(s.charAt(index));
                    index = index + one + 1;
                }
            } else {
                boolean dirDown = true;
                int jump = 0;
                while (index < s.length()) {
                    if (dirDown)
                        jump = one;
                    else
                        jump = two;
                    dirDown = !dirDown;

                    System.out.println(s.charAt(index));
                    sb.append(s.charAt(index));
                    index = index + jump + 1;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("A", 1));
    }
}

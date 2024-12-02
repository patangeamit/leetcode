// Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

// Symbol       Value
// I             1
// V             5
// X             10
// L             50
// C             100
// D             500
// M             1000
// For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

// Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

// I can be placed before V (5) and X (10) to make 4 and 9. 
// X can be placed before L (50) and C (100) to make 40 and 90. 
// C can be placed before D (500) and M (1000) to make 400 and 900.
// Given a roman numeral, convert it to an integer.
public class Solution13 {
    public static int romanToInt(String s) {
        int answer = 0;
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'I') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'V') {
                    answer = answer + 4;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'X') {
                    i += 2;
                    answer = answer + 9;
                } else {
                    answer = answer + 1;
                    i++;
                }
            } else if (s.charAt(i) == 'X') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'L') {
                    answer = answer + 40;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'C') {
                    answer = answer + 90;
                    i += 2;
                } else {
                    answer = answer + 10;
                    i++;
                }
            } else if (s.charAt(i) == 'C') {
                if (i + 1 < s.length() && s.charAt(i + 1) == 'D') {
                    answer = answer + 400;
                    i += 2;
                } else if (i + 1 < s.length() && s.charAt(i + 1) == 'M') {
                    answer = answer + 900;
                    i += 2;
                } else {
                    answer = answer + 100;
                    i++;
                }
            } else if (s.charAt(i) == 'V') {
                answer = answer + 5;
                i++;
            } else if (s.charAt(i) == 'L') {
                answer = answer + 50;
                i++;
            } else if (s.charAt(i) == 'D') {
                answer = answer + 500;
                i++;
            } else if (s.charAt(i) == 'M') {
                answer = answer + 1000;
                i++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}

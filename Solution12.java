// 12. Integer to Roman
// Seven different symbols represent Roman numerals with the following values:

// Symbol	Value
// I	1
// V	5
// X	10
// L	50
// C	100
// D	500
// M	1000
// Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. Converting a decimal place value into a Roman numeral has the following rules:

// If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
// If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol, for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
// Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
// Given an integer, convert it to a Roman numeral.

// Example 1:

// Input: num = 3749

// Output: "MMMDCCXLIX"

// Explanation:

// 3000 = MMM as 1000 (M) + 1000 (M) + 1000 (M)
//  700 = DCC as 500 (D) + 100 (C) + 100 (C)
//   40 = XL as 10 (X) less of 50 (L)
//    9 = IX as 1 (I) less of 10 (X)
// Note: 49 is not 1 (I) less of 50 (L) because the conversion is based on decimal places
// Example 2:

// Input: num = 58

// Output: "LVIII"

// Explanation:

// 50 = L
//  8 = VIII
// Example 3:

// Input: num = 1994

// Output: "MCMXCIV"

// Explanation:

// 1000 = M
//  900 = CM
//   90 = XC
//    4 = IV

// Constraints:

// 1 <= num <= 3999

public class Solution12 {
    public static String intToRoman(int num) {
        // I hate this code.
        StringBuilder sb = new StringBuilder();

        int last_digit = num;
        if (num > 999) {
            while (last_digit > 9) {
                last_digit = last_digit / 10;
            }

            for (int i = 0; i < last_digit; i++) {
                // M here will always be less than 4 because of the constraints.
                sb.append("M");
            }

            num = num - (last_digit * 1000);
        }
        last_digit = num;
        if (num > 99) {
            while (last_digit > 9) {
                last_digit = last_digit / 10;
            }

            if (last_digit < 4)
                for (int i = 0; i < last_digit; i++) { // 0 1 2
                    sb.append("C");
                }
            switch (last_digit) {
                case 4:
                    sb.append("CD");
                    break;
                case 5:
                    sb.append("D");
                    break;
                case 6:
                    sb.append("DC");
                    break;
                case 7:
                    sb.append("DCC");
                    break;
                case 8:
                    sb.append("DCCC");
                    break;
                case 9:
                    sb.append("CM");
                    break;
                default:
                    break;
            }
            num = num - (last_digit * 100);
        }
        last_digit = num;
        if (num > 9) {
            while (last_digit > 9) {
                last_digit = last_digit / 10;
            }

            if (last_digit < 4)
                for (int i = 0; i < last_digit; i++) { // 0 1 2
                    sb.append("X");
                }

            switch (last_digit) {
                case 4:
                    sb.append("XL");
                    break;
                case 5:
                    sb.append("L");
                    break;
                case 6:
                    sb.append("LX");
                    break;
                case 7:
                    sb.append("LXX");
                    break;
                case 8:
                    sb.append("LXXX");
                    break;
                case 9:
                    sb.append("XC");
                    break;
                default:
                    break;
            }
            num = num - (last_digit * 10);
        }
        last_digit = num;
        if (num > 0) {
            while (last_digit > 9) {
                last_digit = last_digit / 10;
            }

            if (last_digit < 4)
                for (int i = 0; i < last_digit; i++) { // 0 1 2
                    sb.append("I");
                }
            switch (last_digit) {
                case 4:
                    sb.append("IV");
                    break;
                case 5:
                    sb.append("V");
                    break;
                case 6:
                    sb.append("VI");
                    break;
                case 7:
                    sb.append("VII");
                    break;
                case 8:
                    sb.append("VIII");
                    break;
                case 9:
                    sb.append("IX");
                    break;
                default:
                    break;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
}
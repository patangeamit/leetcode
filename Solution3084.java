
class Solution3084 {
    public static long countSubstrings(String s, char c) {
        int temp = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
                temp = temp + count;
            }
        }
        return count;
    }

    public static void main(String args[]) {

        System.out.println(countSubstrings("ababa", 'a'));
    }
}
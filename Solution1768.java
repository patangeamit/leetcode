
class Solution1768 {
    public static String mergeAlternately(String word1, String word2) {
        String long_word, short_word;
        String answer = "";
        if (word1.length() > word2.length()) {

            long_word = word1;
            short_word = word2;
        } else {
            long_word = word2;
            short_word = word1;
        }
        for (int i = 0; i < long_word.length(); i++) {
            if (i < short_word.length()) {
                answer = answer + word1.charAt(i) + word2.charAt(i);
            } else {
                answer = answer + long_word.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println(
                mergeAlternately("abc", "pqrstu"));
    }
}

public class Solution1071 {
    public static String gcdOfStrings(String str1, String str2) {
        String answer = "";
        String small, large;
        if (str1.length() > str2.length()) {
            small = str2;
            large = str1;
        } else {
            small = str1;
            large = str2;
        }
        String temp = "";
        for (int i = 0; i < small.length(); i++) {
            temp = temp + small.charAt(i);
            String buff = temp;
            while (buff.length() <= large.length()) {
                if (large.equals(buff)) {

                    answer = temp;
                }
                buff = buff + temp;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println("ans:" +
                gcdOfStrings("TAUXXTAUXXTAUXXTAUXXTAUXX", "TAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXXTAUXX"));
    }
}

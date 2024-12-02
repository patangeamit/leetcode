
class Solution {
    public static int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            int max_digit = 0;
            int curr = num;
            int i = 0;
            while (curr / 10 >= 0 & curr != 0) {
                System.out.println("h");
                i++;
                int curr_digit = curr % 10;
                if (max_digit < curr_digit) {
                    max_digit = curr_digit;
                }
                curr = curr / 10;
            }
            int encrypted_num = 0;
            for (int n = 0; n < i; n++) {
                System.out.println(n);
                encrypted_num *= 10;
                encrypted_num += max_digit;
            }
            sum += encrypted_num;
        }
        return sum;
    }

    public static void main(String args[]) {

        int[] arr = { 10, 21, 31 };
        System.out.println("ans" + sumOfEncryptedInt(arr));
    }
}
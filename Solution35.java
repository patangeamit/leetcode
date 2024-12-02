import java.util.Arrays;

class Solution35 {
    public static int searchInsert(int[] nums, int target) {
        return binSearch(nums, 0, nums.length, target);
    }

    static int binSearch(int[] array, int left, int right, int target) {
        int mid = (left + right) / 2;
        if (right - left == 0)
            return mid;
        if (array[mid] == target) {
            return mid;
        } else if (array[mid] > target) {
            return binSearch(array, left, mid, target);
        } else {
            return binSearch(array, mid + 1, right, target);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 };
        System.out.println(Arrays.toString(arr));
        System.out.println(searchInsert(arr, 97));
    }
}
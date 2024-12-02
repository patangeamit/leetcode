// You have a long flowerbed in which some of the plots are planted, and some are not. However, flowers cannot be planted in adjacent plots.

// Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n, return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule and false otherwise.

// Example 1:

// Input: flowerbed = [1,0,0,0,1], n = 1
// Output: true
// Example 2:

// Input: flowerbed = [1,0,0,0,1], n = 2
// Output: false

import java.util.Arrays;

class Solution650 {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] newFlowerBed = Arrays.copyOf(flowerbed, flowerbed.length);
        if (n == 0)
            return true;
        if (newFlowerBed.length == 1) {
            if (newFlowerBed[0] == 0 && n == 1)
                return true;
            return false;
        }
        for (int i = 0; i < newFlowerBed.length; i++) {
            if (newFlowerBed[i] == 0) {
                if (i == 0) {
                    if (newFlowerBed[i + 1] == 0) {
                        n--;
                        newFlowerBed[i] = 1;
                    }
                } else if (i == newFlowerBed.length - 1) {
                    if (newFlowerBed[i - 1] == 0) {
                        n--;
                        newFlowerBed[i] = 1;
                    }
                } else {
                    if (newFlowerBed[i - 1] == 0 && newFlowerBed[i + 1] == 0) {
                        n--;
                        newFlowerBed[i] = 1;
                    }
                }
            }
        }
        if (n < 1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 0, 0, 0, 1 };
        System.out.println(canPlaceFlowers(arr, 2));

    }
}
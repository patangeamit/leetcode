import java.util.ArrayList;
import java.util.List;

public class Solution1431 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> answer = new ArrayList<Boolean>();
        int highest = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > highest) {
                highest = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            answer.add(candies[i] + extraCandies >= highest);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 3 };
        System.out.println(kidsWithCandies(arr, 3));
    }
}

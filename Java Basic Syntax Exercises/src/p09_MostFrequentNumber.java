import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeMap;

public class p09_MostFrequentNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        TreeMap<Integer, Integer> nums = new TreeMap<>();

        for (int number : numbers) {
            if (!nums.containsKey(number)) {
                nums.put(number, 1);
            } else {
                nums.put(number, nums.get(number) + 1);
            }
        }

        int maxCount = 1;
        int bestKey = numbers[0];

        for (int number : numbers) {
            if (maxCount < nums.get(number)) {
                maxCount = nums.get(number);
                bestKey = number;
            }
        }
        System.out.println(bestKey);

    }
}

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class p06_Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numsAsStr = scanner.nextLine().split("\\s+");

        Integer[] nums = new Integer[numsAsStr.length];

        for (int i = 0; i < numsAsStr.length; i++) {
            nums[i] = Integer.parseInt(numsAsStr[i]);
        }

        Arrays.sort(nums, Collections.reverseOrder());

        if (nums.length < 3) {
            for (Integer num : nums) {
                System.out.println(num);
            }
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println(nums[i]);
            }
        }
    }
}

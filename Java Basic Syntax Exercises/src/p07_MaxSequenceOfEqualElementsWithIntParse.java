import java.util.Arrays;
import java.util.Scanner;

public class p07_MaxSequenceOfEqualElementsWithIntParse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] sequence = Arrays.stream(
                scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int currentStart = 0;
        int currentLen = 1;
        int bestStart = 0;
        int bestLen = 1;

        for (int i = 1; i < sequence.length; i++) {
            if (sequence[i] == sequence[i - 1]) {
                currentLen++;

                if (currentLen > bestLen) {
                    bestLen = currentLen;
                    bestStart = currentStart;
                }

            } else {
                currentLen = 1;
                currentStart = i;

            }
        }

        for (int i = bestStart; i < bestStart + bestLen; i++){
            System.out.print(sequence[i] + " ");
        }
    }
}
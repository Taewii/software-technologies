import java.util.*;
import java.util.stream.Collectors;

public class p12_BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> seq = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int[] bombAndPower = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        int bomb = bombAndPower[0];
        int power = bombAndPower[1];

        for (int i = 0; i < seq.size(); i++) {
            if (seq.get(i) == bomb) {

                for (int j = 0; j < power; j++) {
                    if (i - 1 - j >= 0) {
                        seq.set(i - 1 - j, 0);
                    }
                }

                for (int k = 0; k < power; k++) {
                    if (i + 1 + k < seq.size()) {
                        seq.set(i + 1 + k, 0);
                    }
                }

                seq.set(i, 0);
            }
        }

        int result = 0;

        for (Integer integer : seq) {
            result += integer;
        }

        System.out.println(result);
    }
}

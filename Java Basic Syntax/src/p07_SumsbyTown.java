import java.util.Scanner;
import java.util.TreeMap;

public class p07_SumsbyTown {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        TreeMap<String, Double> dict = new TreeMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split("\\s+\\|\\s+");

            String town = input[0];
            double income = Double.parseDouble(input[1]);

            if (!dict.containsKey(town)) {
               dict.put(town, income);
            } else {
                dict.put(town, dict.get(town) + income);
            }
        }

        for (String item : dict.keySet()) {
            System.out.println(item + " -> " + dict.get(item));
        }
    }
}

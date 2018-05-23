import java.util.Scanner;

public class p03_3IntegersSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbersAsStr = scanner.nextLine().split("\\s+");

        int[] numbers = new int[numbersAsStr.length];

        for (int i = 0; i < numbersAsStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStr[i]);
        }

        int a = numbers[0];
        int b = numbers[1];
        int c = numbers[2];

        if (a + b == c) {
            System.out.printf("%d + %d = %d", Math.min(a, b), Math.max(a, b), c);
        } else if (a + c == b) {
            System.out.printf("%d + %d = %d", Math.min(a, c), Math.max(a, c), b);
        } else if (c + b == a) {
            System.out.printf("%d + %d = %d", Math.min(c, b), Math.max(c, b), a);
        } else {
            System.out.println("No");
        }
    }
}

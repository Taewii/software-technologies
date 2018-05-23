import java.util.Scanner;

public class p05_SymmetricNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n; i++) {
            String num = String.valueOf(i);
            String backwards = "";

            for (int j = num.length() - 1; j >= 0; j--) {
                backwards += num.charAt(j);
            }

            if (num.equals(backwards)) {
                System.out.print(i + " ");
            }
        }
    }
}

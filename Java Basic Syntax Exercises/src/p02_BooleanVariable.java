import java.util.Scanner;

public class p02_BooleanVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Boolean b = Boolean.valueOf(scanner.nextLine());

        if (b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

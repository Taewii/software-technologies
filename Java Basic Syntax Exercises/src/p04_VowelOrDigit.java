import java.util.Scanner;

public class p04_VowelOrDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowels = "aeiou";

        String ch = scanner.nextLine().toLowerCase();

        if (vowels.contains(ch)) {
            System.out.println("vowel");
        } else if (Character.isDigit(ch.toCharArray()[0])) {
            System.out.println("digit");
        } else {
            System.out.println("other");
        }
    }
}

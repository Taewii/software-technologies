import java.util.ArrayList;
import java.util.Scanner;

public class p10_IndexOfLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayList<Character> chars = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++) {
            chars.add(i);
        }

        for (int i = 0; i < input.length(); i++) {
            System.out.println(input.charAt(i) + " -> " + chars.indexOf(input.charAt(i)));
        }
    }
}

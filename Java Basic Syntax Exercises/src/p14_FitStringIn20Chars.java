import java.util.Scanner;

public class p14_FitStringIn20Chars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        if (word.length() >= 20) {
            System.out.println(word.substring(0, 20));
        } else {
            System.out.println(word + padRight(20 - word.length()));
        }
    }

    static String padRight(int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += "*";
        }
        return text;
    }
}

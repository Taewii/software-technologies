import java.util.Scanner;

public class p15_CensorEmailAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String email = scanner.nextLine();
        String text = scanner.nextLine();

        String[] tokens = email.split("@");

        String username = tokens[0];
        String domain = tokens[1];

        String censoredEmail = censor(username.length()) + "@" + domain;

        text = text.replaceAll(email, censoredEmail);
        System.out.println(text);
    }

    static String censor(int count) {
        String text = "";

        for (int i = 0; i < count; i++) {
            text += "*";
        }
        return text;
    }
}

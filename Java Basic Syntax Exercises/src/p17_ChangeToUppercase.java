import java.util.Scanner;

public class p17_ChangeToUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String openingTag = "<upcase>";
        String closingTag = "</upcase>";

        while (text.contains(openingTag)) {
            int indexOfOpening = text.indexOf(openingTag);
            int indexOfClosing = text.indexOf(closingTag) + closingTag.length();

            String textToEdit = text.substring(indexOfOpening, indexOfClosing);
            String textToUpper = textToEdit.substring(openingTag.length(), textToEdit.length() - closingTag.length()).toUpperCase();
            text = text.replace(textToEdit, textToUpper);
        }

        System.out.println(text);
    }
}

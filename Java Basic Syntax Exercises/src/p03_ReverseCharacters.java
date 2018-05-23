import java.util.ArrayList;
import java.util.Scanner;

public class p03_ReverseCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            String ch = scanner.nextLine();

            list.add(0, ch);
        }

        System.out.println(String.join("", list));
    }
}

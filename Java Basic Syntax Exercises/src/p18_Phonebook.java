import java.util.HashMap;
import java.util.Scanner;

public class p18_Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashMap<String, String> phonebook = new HashMap<>();

        String input;
        while (!("END".equals(input = scanner.nextLine()))){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String name = tokens[1];

            if (command.equals("A")) {
                String number = tokens[2];
                    phonebook.put(name, number);
            } else {

                if (phonebook.containsKey(name)) {
                    System.out.println(name + " -> " + phonebook.get(name));
                } else {
                    System.out.printf("Contact %s does not exist.%n", name);
                }
            }
        }
    }
}

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class p19_PhonebookUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        TreeMap<String, String> phonebook = new TreeMap<>();

        String input;
        while (!("END".equals(input = scanner.nextLine()))){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "A": {
                    String name = tokens[1];
                    String number = tokens[2];
                    phonebook.put(name, number);
                    break;
                }
                case "S": {
                    String name = tokens[1];

                    if (phonebook.containsKey(name)) {
                        System.out.println(name + " -> " + phonebook.get(name));
                    } else {
                        System.out.printf("Contact %s does not exist.%n", name);
                    }
                    break;
                }
                default:
                    for (Map.Entry<String, String> entry : phonebook.entrySet()) {
                        System.out.println(entry.getKey() + " -> " + entry.getValue());
                    }
                    break;
            }
        }
    }
}

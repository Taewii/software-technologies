import java.util.Scanner;

public class p06_CompareCharArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] first = scanner.nextLine().split("\\s+");
        String[] second = scanner.nextLine().split("\\s+");

        for (int i = 0; i < Math.min(first.length, second.length); i++) {
            if (first[i].charAt(0) < second[i].charAt(0)) {
                printArr(first);
                printArr(second);
                return;
            } else if (first[i].charAt(0) > second[i].charAt(0)) {
                printArr(second);
                printArr(first);
                return;
            }
        }

        if (first.length < second.length) {
            printArr(first);
            printArr(second);
        } else {
            printArr(second);
            printArr(first);
        }
    }

    static void printArr(String[] arr) {
        for (String s : arr) {
            System.out.print(s);
        }
        System.out.println();
    }
}

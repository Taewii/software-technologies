import java.util.Scanner;

public class p07_MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] elements = scanner.nextLine().split("\\s+");
        int bestLength = 0;
        String bestElement = "";

        int currentBestLength = 0;
        String currentBestElement = "";

        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];

            if (element.equals(currentBestElement) || currentBestElement.equals("")) {
                currentBestElement = element;
                currentBestLength++;
            } else {
                if (currentBestLength > bestLength) {
                    bestElement = currentBestElement;
                    bestLength = currentBestLength;
                }
                currentBestLength = 1;
                currentBestElement = element;
            }

            if (i == elements.length - 1) {
                if (currentBestLength > bestLength) {
                    bestElement = currentBestElement;
                    bestLength = currentBestLength;
                }
            }
        }

        if (bestLength == 0){
            System.out.println(repeatStr(currentBestElement, currentBestLength));
        } else {
            System.out.println(repeatStr(bestElement, bestLength));
        }
    }

    static String repeatStr(String str, int count) {
        String text = "";
        for (int i = 0; i < count; i++) {
            text += str + " ";
        }
        return text;
    }
}

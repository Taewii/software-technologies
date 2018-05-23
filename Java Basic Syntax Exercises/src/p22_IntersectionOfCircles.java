import java.util.Arrays;
import java.util.Scanner;

public class p22_IntersectionOfCircles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] firstCircle = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double[] secondCircle = Arrays
                .stream(scanner.nextLine()
                        .split(" "))
                .mapToDouble(Double::parseDouble)
                .toArray();

        double x1 = firstCircle[0];
        double x2 = firstCircle[1];
        double r1 = firstCircle[2];
        double y1 = secondCircle[0];
        double y2 = secondCircle[1];
        double r2 = secondCircle[2];

        double distance = Math.sqrt(Math.pow((x1-y1), 2) + Math.pow((x2-y2), 2));

        if (distance <= r1 + r2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}

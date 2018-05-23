import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class p20_CountWorkingDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalDays = 0;
        int[] holidayDays = {
                1, 3, 1, 6, 24, 6, 22, 1, 24, 25, 26
        };

        int[] holidayMonths = {
                1, 3, 5, 5, 5, 9, 9, 11, 12, 12, 12
        };

        LocalDate firstDate = LocalDate.parse(scanner.nextLine(),
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate secondDate = LocalDate.parse(scanner.nextLine(),
                DateTimeFormatter.ofPattern("dd-MM-yyyy"));

        for (LocalDate date = firstDate;
             date.isBefore(secondDate.plusDays(1));
             date = date.plusDays(1)) {
            int day = date.getDayOfWeek().getValue();

            if (day == 6 || day == 7) {
                continue;
            }

            int dayOfMonth = date.getDayOfMonth();
            int month = date.getMonth().getValue();
            boolean isHoliday = false;

            for (int i = 0; i < holidayDays.length; i++) {
                if (holidayDays[i] == dayOfMonth && holidayMonths[i] == month) {
                    isHoliday = true;
                    break;
                }
            }

            if (isHoliday) {
                continue;
            }

            totalDays++;
        }
        System.out.println(totalDays);
    }
}


package collections;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class QuestionDateTimeAPI02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year (YYYY): ");
        int year = sc.nextInt();

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        LocalDate firstDay = LocalDate.of(year, month, 1);
        LocalDate firstSunday = firstDay.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        LocalDate secondSunday = firstSunday.plusWeeks(1);

        System.out.println("Second Sunday of " + month + "/" + year + ": " + secondSunday);

        sc.close();
    }
}

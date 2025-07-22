
package collections;

import java.time.LocalTime;
import java.util.Scanner;

public class QuestionDateTimeAPI06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hours to subtract: ");
        int hours = sc.nextInt();

        System.out.print("Enter minutes to subtract: ");
        int minutes = sc.nextInt();

        LocalTime now = LocalTime.now();
        LocalTime beforeTime = now.minusHours(hours).minusMinutes(minutes);

        System.out.println("Current Time: " + now);
        System.out.println("Time Before " + hours + " Hours and " + minutes + " Minutes: " + beforeTime);

        sc.close();
    }
}

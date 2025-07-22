package collections;

import java.time.LocalTime;
import java.util.Scanner;

public class QuestionDateTimeAPI05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of minutes to add: ");
        int minutes = sc.nextInt();

        LocalTime now = LocalTime.now();
        LocalTime afterTime = now.plusMinutes(minutes);

        System.out.println("Current Time: " + now);
        System.out.println("Time After " + minutes + " Minutes: " + afterTime);

        sc.close();
    }
}
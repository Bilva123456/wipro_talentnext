package collections;

import java.time.LocalDate;
import java.util.Scanner;

public class QuestionDateTimeAPI04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        boolean isLeap = LocalDate.of(year, 1, 1).isLeapYear();

        System.out.println(year + (isLeap ? " is a Leap Year." : " is Not a Leap Year."));

        sc.close();
    }
}
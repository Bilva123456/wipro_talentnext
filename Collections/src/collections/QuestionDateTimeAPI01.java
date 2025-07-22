package collections;

import java.time.LocalDate;
import java.util.Scanner;

public class QuestionDateTimeAPI01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a date (yyyy-mm-dd) or press enter to use today:");
        String input = sc.nextLine();

        LocalDate date = input.isEmpty() ? LocalDate.now() : LocalDate.parse(input);
        LocalDate afterTenDays = date.plusDays(10);

        System.out.println("Given Date: " + date);
        System.out.println("Date After 10 Days: " + afterTenDays);

        sc.close();
    }
}
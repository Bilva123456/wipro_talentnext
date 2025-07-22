package collections;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class QuestionDateTimeAPI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Wipro joining date (yyyy-mm-dd):");
        String dateInput = sc.nextLine();

        LocalDate joiningDate = LocalDate.parse(dateInput);
        LocalDate today = LocalDate.now();

        Period experience = Period.between(joiningDate, today);

        System.out.println("Experience: " + experience.getYears() + " Years, "
                + experience.getMonths() + " Months, " + experience.getDays() + " Days");

        sc.close();
    }
}
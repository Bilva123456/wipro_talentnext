package oops_Inheritence;

import java.util.Scanner;

public class QuestionStringConcatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter names (e.g., Sachin,Tendulkar): ");
        String input = scanner.nextLine();
        
        // Split using comma
        String[] parts = input.split(",");

        
        if (parts.length == 2) {
            String name1 = parts[0].toLowerCase();
            String name2 = parts[1].toLowerCase();

           
            if (Character.isUpperCase(parts[1].charAt(0))) {
                System.out.println(name1 + " " + name2);  
            } else {
                System.out.println(name1 + name2);       
            }
        } else {
            System.out.println("Invalid input format. Please use a comma to separate two names.");
        }

        scanner.close();
    }
}

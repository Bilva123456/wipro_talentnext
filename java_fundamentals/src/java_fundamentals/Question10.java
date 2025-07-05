package java_fundamentals;
import java.util.Scanner;
public class Question10 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        char ch = scanner.next().charAt(0);
         if (Character.isLowerCase(ch)) {
            System.out.println("Input: " + ch);
            System.out.println("Output: " + ch + "->" + Character.toUpperCase(ch));
        } else if (Character.isUpperCase(ch)) {
            System.out.println("Input: " + ch);
            System.out.println("Output: " + ch + "->" + Character.toLowerCase(ch));
        } else {
            System.out.println("Please enter a valid alphabetic character.");
        }
        scanner.close();
    }


}



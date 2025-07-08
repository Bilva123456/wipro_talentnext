package oops;

import java.util.Scanner;

public class QuestionFirstHalfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = getFirstHalf(input);
        if (result == null) {
            System.out.println("Result: null");
        } else {
            System.out.println("Result: " + result);
        }
        
        scanner.close();
    }
    
    public static String getFirstHalf(String str) {
        if (str.length() % 2 != 0) {
            return null;
        }
        
        int halfLength = str.length() / 2;
        return str.substring(0, halfLength);
    }
}
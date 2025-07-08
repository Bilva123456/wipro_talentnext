package oops_Inheritence;

import java.util.Scanner;

public class QuestionStringRepetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = repeatFirstTwoChars(input);
        System.out.println("Result: " + result);
        
        scanner.close();
    }
    
    public static String repeatFirstTwoChars(String str) {
        if (str.length() < 2) {
            return str;
        }
        
        String firstTwo = str.substring(0, 2);
        int n = str.length();
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(firstTwo);
        }
        
        return sb.toString();
    }
}
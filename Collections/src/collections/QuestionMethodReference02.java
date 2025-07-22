package collections;

import java.util.Scanner;

interface DigitCountInterface {
    int digitCount(int n);
}

class DigitClass {
    public static int digitCount(int n) {
        return String.valueOf(Math.abs(n)).length();
    }
}

public class QuestionMethodReference02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DigitCountInterface dc = DigitClass::digitCount;

        System.out.print("Enter a number to count digits: ");
        int num = sc.nextInt();

        System.out.println("Number of digits in " + num + " is: " + dc.digitCount(num));

        sc.close();
    }
}
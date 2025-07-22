package collections;

import java.util.Scanner;

interface FactorialInterface {
    int factorial(int n);
}

class FactorialClass {
    public int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}

public class QuestionMethodReference01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FactorialClass obj = new FactorialClass();
        FactorialInterface fi = obj::factorial;

        System.out.print("Enter a number to calculate factorial: ");
        int num = sc.nextInt();

        System.out.println("Factorial of " + num + " is: " + fi.factorial(num));

        sc.close();
    }
}
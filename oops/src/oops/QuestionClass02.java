package oops;

import java.util.Scanner;

class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}

	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}

public class QuestionClass02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter two integers for power calculation: ");
		int int1 = scanner.nextInt();
		int int2 = scanner.nextInt();

		System.out.println("Power (int): " + Calculator.powerInt(int1, int2));

		System.out.print("Enter a double and an integer for power calculation: ");
		double double1 = scanner.nextDouble();
		int int3 = scanner.nextInt();

		System.out.println("Power (double): " + Calculator.powerDouble(double1, int3));

		scanner.close();
	}
}

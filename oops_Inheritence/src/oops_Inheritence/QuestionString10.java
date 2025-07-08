package oops_Inheritence;

import java.util.Scanner;

public class QuestionString10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string:");
		String str = sc.nextLine();
		System.out.println("Enter n:");
		int n = sc.nextInt();

		if (n <= 0 || n > str.length()) {
			System.out.println("");
		} else {
			String lastN = str.substring(str.length() - n);
			StringBuilder result = new StringBuilder();
			for (int i = 0; i < n; i++) {
				result.append(lastN);
			}
			System.out.println(result.toString());
		}

		sc.close();
	}
}

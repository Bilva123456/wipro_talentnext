package oops;

import java.util.Scanner;

public class QuestionString09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String a = sc.nextLine();
		System.out.println("Enter second string:");
		String b = sc.nextLine();

		StringBuilder result = new StringBuilder();
		int minLen = Math.min(a.length(), b.length());

		for (int i = 0; i < minLen; i++) {
			result.append(a.charAt(i));
			result.append(b.charAt(i));
		}

		if (a.length() > minLen) {
			result.append(a.substring(minLen));
		}
		if (b.length() > minLen) {
			result.append(b.substring(minLen));
		}

		System.out.println(result.toString());

		sc.close();
	}
}

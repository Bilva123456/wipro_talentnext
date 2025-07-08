package oops_Inheritence;

import java.util.Scanner;

public class QuestionString08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string with *:");
		String str = sc.nextLine();

		int starIndex = str.indexOf('*');
		if (starIndex == -1) {
			System.out.println(str);
		} else {
			StringBuilder result = new StringBuilder();

			if (starIndex > 1) {
				result.append(str.substring(0, starIndex - 1));
			}

			if (starIndex < str.length() - 2) {
				result.append(str.substring(starIndex + 2));
			}

			System.out.println(result.toString());
		}

		sc.close();
	}
}

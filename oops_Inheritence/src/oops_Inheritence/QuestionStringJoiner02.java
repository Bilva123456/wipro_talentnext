package oops_Inheritence;

import java.util.Scanner;
import java.util.StringJoiner;

public class QuestionStringJoiner02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of cities for first StringJoiner:");
		int n1 = sc.nextInt();
		sc.nextLine();

		StringJoiner s1 = new StringJoiner("-");

		System.out.println("Enter " + n1 + " city names for s1:");
		for (int i = 0; i < n1; i++) {
			s1.add(sc.nextLine());
		}

		System.out.println("Enter number of cities for second StringJoiner:");
		int n2 = sc.nextInt();
		sc.nextLine();

		StringJoiner s2 = new StringJoiner("-");

		System.out.println("Enter " + n2 + " city names for s2:");
		for (int i = 0; i < n2; i++) {
			s2.add(sc.nextLine());
		}

		System.out.println("Original s1: " + s1.toString());
		System.out.println("Original s2: " + s2.toString());

		StringJoiner s1Copy = new StringJoiner("-");
		s1Copy.add(s1.toString());
		s1Copy.merge(s2);

		StringJoiner s2Copy = new StringJoiner("-");
		s2Copy.add(s2.toString());
		s2Copy.merge(s1);

		System.out.println("i) s1 merged to s2: " + s1Copy.toString());
		System.out.println("ii) s2 merged to s1: " + s2Copy.toString());

		sc.close();
	}
}

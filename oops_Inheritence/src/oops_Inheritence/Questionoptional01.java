package oops_Inheritence;

import java.util.Optional;
import java.util.Scanner;

public class Questionoptional01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String names[] = new String[5];

		System.out.println("Enter 5 names (or press enter for null):");
		for (int i = 0; i < 5; i++) {
			System.out.print("Name " + (i + 1) + ": ");
			String input = sc.nextLine();
			if (!input.trim().isEmpty()) {
				names[i] = input;
			}
		}

		System.out.println("Enter index to check length (0 to 4, total 5 elements):");
		int index = sc.nextInt();

		if (index >= 0 && index < names.length) {
			Optional<String> optionalName = Optional.ofNullable(names[index]);

			if (optionalName.isPresent()) {
				System.out.println("Length: " + optionalName.get().length());
			} else {
				System.out.println("Name at index " + index + " is null");
			}
		} else {
			System.out.println("Invalid index");
		}

		sc.close();
	}
}
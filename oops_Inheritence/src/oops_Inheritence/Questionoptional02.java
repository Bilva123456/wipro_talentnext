package oops_Inheritence;

import java.util.Optional;
import java.util.Scanner;

public class Questionoptional02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter address (or press enter for null):");
		String input = sc.nextLine();

		String address = null;
		if (!input.trim().isEmpty()) {
			address = input;
		}

		Optional<String> optionalAddress = Optional.ofNullable(address);

		String result = optionalAddress.orElse("India");

		System.out.println("Address: " + result);

		sc.close();
	}
}

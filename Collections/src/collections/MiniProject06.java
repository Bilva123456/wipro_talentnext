package collections;

import java.util.*;

public class MiniProject06 {

	public static ArrayList<String> performStringOperations(String s1, String s2) {
		ArrayList<String> result = new ArrayList<>();

		StringBuilder altReplace = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			if (i % 2 == 0) {
				altReplace.append(s2);
			} else {
				altReplace.append(s1.charAt(i));
			}
		}
		result.add(altReplace.toString());

		int lastIndex = s1.lastIndexOf(s2);
		if (lastIndex != -1 && s1.indexOf(s2) != lastIndex) {
			String reversedS2 = new StringBuilder(s2).reverse().toString();
			String replaced = s1.substring(0, lastIndex) + reversedS2 + s1.substring(lastIndex + s2.length());
			result.add(replaced);
		} else {
			result.add(s1 + s2);
		}

		int firstIndex = s1.indexOf(s2);
		if (firstIndex != -1 && s1.indexOf(s2) != s1.lastIndexOf(s2)) {
			String deleted = s1.substring(0, firstIndex) + s1.substring(firstIndex + s2.length());
			result.add(deleted);
		} else {
			result.add(s1);
		}

		int mid = (s2.length() + 1) / 2;
		String firstHalf = s2.substring(0, mid);
		String secondHalf = s2.substring(mid);
		result.add(firstHalf + s1 + secondHalf);

		StringBuilder replacedChars = new StringBuilder(s1);
		for (int i = 0; i < replacedChars.length(); i++) {
			if (s2.indexOf(replacedChars.charAt(i)) != -1) {
				replacedChars.setCharAt(i, '*');
			}
		}
		result.add(replacedChars.toString());

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String 1: ");
		String s1 = sc.nextLine();

		System.out.print("Enter String 2 (smaller string): ");
		String s2 = sc.nextLine();

		ArrayList<String> outputList = performStringOperations(s1, s2);

		System.out.println("Output:");
		for (String output : outputList) {
			System.out.println(output);
		}

		sc.close();
	}
}

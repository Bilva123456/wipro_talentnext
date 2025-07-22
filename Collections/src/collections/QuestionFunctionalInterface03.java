package collections;

import java.util.*;
import java.util.function.Predicate;

public class QuestionFunctionalInterface03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            words.add(sc.nextLine());
        }

        Predicate<String> isPalindrome = word -> word.equalsIgnoreCase(new StringBuilder(word).reverse().toString());

        System.out.println("Palindrome Words:");
        words.stream().filter(isPalindrome).forEach(System.out::println);

        sc.close();
    }
}
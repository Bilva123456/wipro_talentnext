package collections;

import java.util.*;
import java.util.function.Consumer;

public class QuestionFunctionalInterface06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        System.out.println("Enter 10 words:");
        for (int i = 0; i < 10; i++) {
            words.add(sc.nextLine());
        }

        Consumer<ArrayList<String>> reverseConsumer = list -> {
            for (int i = 0; i < list.size(); i++) {
                list.set(i, new StringBuilder(list.get(i)).reverse().toString());
            }
        };

        reverseConsumer.accept(words);

        System.out.println("Words after reverse:");
        words.forEach(System.out::println);

        sc.close();
    }
}
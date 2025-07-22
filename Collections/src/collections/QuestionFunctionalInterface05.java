package collections;

import java.util.*;
import java.util.function.Predicate;

public class QuestionFunctionalInterface05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        Predicate<Integer> isPerfectSquare = num -> Math.sqrt(num) == Math.floor(Math.sqrt(num));

        System.out.println("Perfect Square Numbers:");
        numbers.stream().filter(isPerfectSquare).forEach(System.out::println);

        sc.close();
    }
}
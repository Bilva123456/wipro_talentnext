
package collections;

import java.util.*;
import java.util.function.Consumer;

public class QuestionFunctionalInterface07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers.add(sc.nextInt());
        }

        Consumer<Integer> oddEvenConsumer = num -> {
            if (num % 2 == 0) {
                System.out.println(num + " even");
            } else {
                System.out.println(num + " odd");
            }
        };

        numbers.forEach(oddEvenConsumer);

        sc.close();
    }
}

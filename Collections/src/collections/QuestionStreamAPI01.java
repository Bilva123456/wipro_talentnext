package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class QuestionStreamAPI01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        List<Integer> negativeEven = numbers.stream()
                .filter(num -> num < 0 && num % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative Even Numbers:");
        negativeEven.forEach(System.out::println);

        sc.close();
    }
}
package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionLambdaExpressions01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> al = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }

        System.out.println("Prime Numbers:");
        al.stream().filter(num -> {
            if (num <= 1) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }).forEach(System.out::println);

        sc.close();
    }
}
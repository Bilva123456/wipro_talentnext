package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionLambdaExpressions02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> al = new ArrayList<>();

        System.out.print("Enter number of words: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter " + n + " words:");
        for (int i = 0; i < n; i++) {
            al.add(sc.nextLine());
        }

        System.out.println("Words in Reverse Order:");
        al.forEach(word -> System.out.println(new StringBuilder(word).reverse()));

        sc.close();
    }
}
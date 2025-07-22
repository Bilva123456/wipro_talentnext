package collections;

import java.util.Scanner;

interface WordCount {
    int count(String str);
}

public class QuestionLambdaExpressions04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        WordCount wc = (str) -> {
            if (str == null || str.isEmpty()) return 0;
            return str.trim().split("\\s+").length;
        };

        System.out.print("Enter a sentence: ");
        String input = sc.nextLine();

        int wordCount = wc.count(input);
        System.out.println("Number of words: " + wordCount);

        sc.close();
    }
}
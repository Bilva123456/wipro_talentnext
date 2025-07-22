package collections;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Iterator;
import java.util.NavigableSet;

public class QuestionSet03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<String> ts = new TreeSet<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String value = sc.nextLine();
            ts.add(value);
        }

        System.out.println("\nElements using Iterator:");
        Iterator<String> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nElements in reverse order:");
        NavigableSet<String> reverseTs = ts.descendingSet();
        for (String s : reverseTs) {
            System.out.println(s);
        }

        System.out.print("\nEnter element to search: ");
        String search = sc.nextLine();
        if (ts.contains(search)) {
            System.out.println(search + " exists in the TreeSet.");
        } else {
            System.out.println(search + " does not exist in the TreeSet.");
        }

        sc.close();
    }
}
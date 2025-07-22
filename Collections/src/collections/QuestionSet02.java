package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class QuestionSet02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> employees = new HashSet<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name " + (i + 1) + ": ");
            String name = sc.nextLine();
            employees.add(name);
        }

        System.out.println("\nEmployee names using Iterator:");
        Iterator<String> it = employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}
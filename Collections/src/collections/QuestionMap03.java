package collections;

import java.util.Properties;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class QuestionMap03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Properties states = new Properties();

        System.out.print("Enter number of states: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter state name " + (i + 1) + ": ");
            String state = sc.nextLine();

            System.out.print("Enter capital of " + state + ": ");
            String capital = sc.nextLine();

            states.setProperty(state, capital);
        }

        Set<Object> keys = states.keySet();
        Iterator<Object> it = keys.iterator();

        System.out.println("\nStates and Capitals:");
        while (it.hasNext()) {
            Object key = it.next();
            System.out.println("State: " + key + ", Capital: " + states.getProperty((String) key));
        }

        sc.close();
    }
}
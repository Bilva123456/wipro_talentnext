package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class QuestionMap04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> contactList = new HashMap<>();

        System.out.print("Enter number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter contact name: ");
            String name = sc.nextLine();

            System.out.print("Enter phone number: ");
            int number = sc.nextInt();
            sc.nextLine();

            contactList.put(name, number);
        }

        System.out.print("\nEnter contact name to check: ");
        String nameCheck = sc.nextLine();
        if (contactList.containsKey(nameCheck)) {
            System.out.println("Contact exists: " + nameCheck);
        } else {
            System.out.println("Contact does not exist.");
        }

        System.out.print("Enter phone number to check: ");
        int numberCheck = sc.nextInt();
        if (contactList.containsValue(numberCheck)) {
            System.out.println("Phone number exists: " + numberCheck);
        } else {
            System.out.println("Phone number does not exist.");
        }

        System.out.println("\nContact list using Iterator:");
        Iterator<Map.Entry<String, Integer>> it = contactList.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println("Name: " + entry.getKey() + ", Number: " + entry.getValue());
        }

        sc.close();
    }
}
package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class QuestionMap02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<>();

        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter key " + (i + 1) + ": ");
            String key = sc.nextLine();
            System.out.print("Enter value for " + key + ": ");
            String value = sc.nextLine();
            map.put(key, value);
        }

        System.out.print("\nEnter key to check: ");
        String checkKey = sc.nextLine();
        if (map.containsKey(checkKey)) {
            System.out.println("Key exists: " + checkKey);
        } else {
            System.out.println("Key does not exist.");
        }

        System.out.print("Enter value to check: ");
        String checkValue = sc.nextLine();
        if (map.containsValue(checkValue)) {
            System.out.println("Value exists: " + checkValue);
        } else {
            System.out.println("Value does not exist.");
        }

        System.out.println("\nAll entries using Iterator:");
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        sc.close();
    }
}
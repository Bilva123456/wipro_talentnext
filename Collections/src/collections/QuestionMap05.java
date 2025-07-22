package collections;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;

public class QuestionMap05{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeMap<String, String> countryCapital = new TreeMap<>();

        System.out.print("Enter number of country-capital pairs: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name: ");
            String country = sc.nextLine();
            System.out.print("Enter capital: ");
            String capital = sc.nextLine();
            countryCapital.put(country, capital);
        }

        System.out.println("\nCountry-Capital using Iterator:");
        Iterator<Map.Entry<String, String>> it = countryCapital.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> entry = it.next();
            System.out.println("Country: " + entry.getKey() + ", Capital: " + entry.getValue());
        }

        System.out.print("\nEnter country to check: ");
        String checkCountry = sc.nextLine();
        System.out.println(countryCapital.containsKey(checkCountry) ? "Country exists." : "Country not found.");

        System.out.print("Enter capital to check: ");
        String checkCapital = sc.nextLine();
        System.out.println(countryCapital.containsValue(checkCapital) ? "Capital exists." : "Capital not found.");

        sc.close();
    }
}
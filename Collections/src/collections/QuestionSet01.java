package collections;

import java.util.HashSet;
import java.util.Scanner;

class CountryHashSet {
    HashSet<String> H1 = new HashSet<>();

    public HashSet<String> saveCountryNames(String countryName) {
        H1.add(countryName);
        return H1;
    }

    public String getCountry(String countryName) {
        for (String country : H1) {
            if (country.equalsIgnoreCase(countryName)) {
                return country;
            }
        }
        return null;
    }
}

public class QuestionSet01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CountryHashSet obj = new CountryHashSet();

        System.out.print("Enter number of countries to add: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name " + (i + 1) + ": ");
            String country = sc.nextLine();
            obj.saveCountryNames(country);
        }

        System.out.println("\nStored Countries: " + obj.H1);

        System.out.print("\nEnter country name to search: ");
        String search = sc.nextLine();

        String result = obj.getCountry(search);

        if (result != null) {
            System.out.println(search + " exists in the set.");
        } else {
            System.out.println(search + " does not exist in the set.");
        }

        sc.close();
    }
}
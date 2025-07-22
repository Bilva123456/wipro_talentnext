package collections;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class QuestionMap01 {
    HashMap<String, String> M1 = new HashMap<>();

    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {
        M1.put(countryName, capital);
        return M1;
    }

    public String getCapital(String countryName) {
        return M1.get(countryName);
    }

    public String getCountry(String capitalName) {
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            if (entry.getValue().equalsIgnoreCase(capitalName)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public HashMap<String, String> swapCountryCapital() {
        HashMap<String, String> M2 = new HashMap<>();
        for (Map.Entry<String, String> entry : M1.entrySet()) {
            M2.put(entry.getValue(), entry.getKey());
        }
        return M2;
    }

    public ArrayList<String> getAllCountries() {
        return new ArrayList<>(M1.keySet());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionMap01 obj = new QuestionMap01();

        System.out.print("Enter number of countries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter country name " + (i + 1) + ": ");
            String country = sc.nextLine();

            System.out.print("Enter capital of " + country + ": ");
            String capital = sc.nextLine();

            obj.saveCountryCapital(country, capital);
        }

        System.out.println("\nStored Country-Capital Pairs: " + obj.M1);

        System.out.print("\nEnter country name to get capital: ");
        String searchCountry = sc.nextLine();
        String capital = obj.getCapital(searchCountry);
        if (capital != null) {
            System.out.println("Capital of " + searchCountry + " is: " + capital);
        } else {
            System.out.println(searchCountry + " not found.");
        }

        System.out.print("\nEnter capital name to get country: ");
        String searchCapital = sc.nextLine();
        String country = obj.getCountry(searchCapital);
        if (country != null) {
            System.out.println(searchCapital + " is the capital of: " + country);
        } else {
            System.out.println(searchCapital + " not found.");
        }

        System.out.println("\nSwapped Map (Capital → Country): " + obj.swapCountryCapital());
        System.out.println("All Countries List: " + obj.getAllCountries());

        sc.close();
    }
}
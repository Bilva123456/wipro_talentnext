package collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class EmployeeFunc {
    int id;
    String name;
    String location;
    double salary;

    EmployeeFunc(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class QuestionFunctionalInterface01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<EmployeeFunc> employees = new ArrayList<>();

        System.out.println("Enter details for employees:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Location: ");
            String location = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            employees.add(new EmployeeFunc(id, name, location, salary));
        }

        Function<EmployeeFunc, String> locationExtractor = emp -> emp.location;

        ArrayList<String> locations = employees.stream()
                .map(locationExtractor)
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println("Extracted Locations:");
        locations.forEach(System.out::println);

        sc.close();
    }
}
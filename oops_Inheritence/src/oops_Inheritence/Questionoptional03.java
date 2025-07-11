package oops_Inheritence;
import java.util.Optional;
import java.util.Scanner;

public class Questionoptional03 {

    class Employee {
        private String name;
        private int id;

        public Employee(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public String toString() {
            return "Employee{name='" + name + "', id=" + id + "}";
        }
    }

    class InvalidEmployeeException extends Exception {
        public InvalidEmployeeException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Questionoptional03 outer = new Questionoptional03();
        outer.runProgram();
    }

    public void runProgram() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Do you want to create an employee? (y/n):");
        String choice = sc.nextLine();

        Employee employee = null;

        if (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter employee name:");
            String name = sc.nextLine();
            System.out.println("Enter employee id:");
            int id = sc.nextInt();
            employee = new Employee(name, id);
        }

        Optional<Employee> optionalEmployee = Optional.ofNullable(employee);

        try {
            Employee emp = optionalEmployee.orElseThrow(() ->
                new InvalidEmployeeException("Employee object is null"));

            System.out.println("Employee details: " + emp);
        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
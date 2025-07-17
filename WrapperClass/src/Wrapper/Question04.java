package Wrapper;


import java.util.Scanner;

class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + salary);
    }
}

public class Question04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();

        Employee emp1 = new Employee(id, name, salary);

        try {
            Employee emp2 = (Employee) emp1.clone();

            // Change original employee details using Scanner again
            System.out.println("\n--- Update Original Employee Details ---");
            System.out.print("Enter new Employee Name: ");
            sc.nextLine(); // Consume newline
            emp1.name = sc.nextLine();

            System.out.print("Enter new Employee Salary: ");
            emp1.salary = sc.nextDouble();

            System.out.println("\nOriginal Employee (After Modification):");
            emp1.display();

            System.out.println("\nCloned Employee (Unchanged):");
            emp2.display();

        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported.");
        }

        sc.close();
    }
}

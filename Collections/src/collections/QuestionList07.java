package collections;
import java.util.Vector;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Scanner;

class EmployeeDetails {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public EmployeeDetails(int empId, String empName, String email, String gender, float salary) {
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails() {
        System.out.println("ID: " + empId + ", Name: " + empName + ", Email: " + email +
                ", Gender: " + gender + ", Salary: " + salary);
    }
}

public class QuestionList07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<EmployeeDetails> employees = new Vector<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Employee Email: ");
            String email = sc.nextLine();

            System.out.print("Employee Gender: ");
            String gender = sc.nextLine();

            System.out.print("Employee Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();

            employees.add(new EmployeeDetails(id, name, email, gender, salary));
        }

        System.out.println("\nEmployee details using Iterator:");
        Iterator<EmployeeDetails> it = employees.iterator();
        while (it.hasNext()) {
            it.next().getEmployeeDetails();
        }

        System.out.println("\nEmployee details using Enumeration:");
        Enumeration<EmployeeDetails> en = employees.elements();
        while (en.hasMoreElements()) {
            en.nextElement().getEmployeeDetails();
        }

        sc.close();
    }
}
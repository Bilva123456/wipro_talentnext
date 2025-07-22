package collections;
import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    public Employee(int empId, String empName, String email, String gender, float salary) {
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

class EmployeeDB {
    ArrayList<Employee> list = new ArrayList<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    String showPaySlip(int empId) {
        for (Employee e : list) {
            if (e.empId == empId) {
                return "Pay slip for " + e.empName + " is: " + e.salary;
            }
        }
        return "Employee not found!";
    }
}

public class QuestionList02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EmployeeDB empDB = new EmployeeDB();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            System.out.print("Salary: ");
            float salary = sc.nextFloat();
            sc.nextLine();

            Employee e = new Employee(id, name, email, gender, salary);
            empDB.addEmployee(e);
        }

        System.out.println("\nEmployee Details:");
        for (Employee e : empDB.list) {
            e.getEmployeeDetails();
        }

        System.out.print("\nEnter Employee ID to delete: ");
        int delId = sc.nextInt();
        if (empDB.deleteEmployee(delId)) {
            System.out.println("Employee deleted successfully.");
        } else {
            System.out.println("Employee not found.");
        }

        System.out.print("\nEnter Employee ID to show pay slip: ");
        int payId = sc.nextInt();
        System.out.println(empDB.showPaySlip(payId));

        sc.close();
    }
}
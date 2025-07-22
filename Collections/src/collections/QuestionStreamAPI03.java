package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Student {
    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }
}

public class QuestionStreamAPI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter details for students required:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            int mark = sc.nextInt();

            students.add(new Student(rollNo, name, mark));
        }

        List<Student> passedStudents = students.stream()
                .filter(st -> st.mark >= 50)
                .collect(Collectors.toList());

        System.out.println("Students who cleared the test:");
        passedStudents.forEach(st -> System.out.println(st.rollNo + " " + st.name + " " + st.mark));

        System.out.println("Total students who cleared: " + passedStudents.size());

        sc.close();
    }
}
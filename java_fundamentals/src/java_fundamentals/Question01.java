package java_fundamentals;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String company = sc.nextLine();
        String location = sc.nextLine();
        System.out.println(company + " Technologies " + location);
        sc.close();
    }
}


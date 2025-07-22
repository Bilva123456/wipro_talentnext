package collections;

import java.util.Scanner;

interface PrimeCheckInterface {
    PrimeClass check(int n);
}

class PrimeClass {
    PrimeClass(int n) {
        if (n <= 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("Not Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}

public class QuestionMethodReference03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PrimeCheckInterface pi = PrimeClass::new;

        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();

        pi.check(num);

        sc.close();
    }
}
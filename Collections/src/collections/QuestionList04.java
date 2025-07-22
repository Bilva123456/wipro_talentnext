package collections;
import java.util.ArrayList;
import java.util.Scanner;

public class QuestionList04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Number> numberList = new ArrayList<>();

        System.out.print("Enter number of numeric elements: ");
int n = sc.nextInt();

for (int i = 0; i < n; i++) {
    System.out.print("Enter number " + (i + 1) + ": ");
    double num = sc.nextDouble();
    numberList.add(num);
}

System.out.println("\nStored Numbers in ArrayList:");
	        for (Number number : numberList) {
	            System.out.println(number);
	        }

	        sc.close();
	    }
	}
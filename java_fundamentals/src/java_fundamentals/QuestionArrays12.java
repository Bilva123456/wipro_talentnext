package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays12 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[3];
        int[] b = new int[3];
        
        System.out.println("Enter first array (3 elements):");
        for(int i = 0; i < 3; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.println("Enter second array (3 elements):");
        for(int i = 0; i < 3; i++) {
            b[i] = sc.nextInt();
        }
        
        int[] result = new int[2];
        result[0] = a[1];
        result[1] = b[1];
        
        System.out.print("Middle elements: ");
        for(int i = 0; i < 2; i++) {
            System.out.print(result[i] + " ");
        }
        
        sc.close();
}
}
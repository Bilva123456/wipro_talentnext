package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays04 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter array size: ");
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter ASCII values:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        System.out.print("Characters: ");
	        for(int i = 0; i < n; i++) {
	            System.out.print((char)arr[i] + " ");
	        }
	        
	        sc.close();
	    }
}

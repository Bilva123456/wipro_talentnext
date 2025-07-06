package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays01 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] arr = new int[n];
	        
	        System.out.println("Enter array elements:");
	        for(int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }
	        
	        int sum = 0;
	        for(int i = 0; i < n; i++) {
	            sum += arr[i];
	        }
	        
	        double average = (double)sum / n;
	        System.out.println("Sum: " + sum);
	        System.out.println("Average: " + average);
	        
	        sc.close();
	    }
	}



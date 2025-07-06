package java_fundamentals;
import java.util.Scanner;
import java.util.Arrays;
public class QuestionArrays05 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        Arrays.sort(arr);
        
        System.out.println("Smallest 2 numbers: " + arr[0] + " " + arr[1]);
        System.out.println("Largest 2 numbers: " + arr[n-2] + " " + arr[n-1]);
        
        sc.close();
    }
}

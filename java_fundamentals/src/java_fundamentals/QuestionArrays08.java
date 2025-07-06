package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays08 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i = 0; i < n; i++) {
            if(i < n-1 && arr[i] == 6 && arr[i+1] == 7) {
                i++;
                continue;
            }
            if(i > 0 && arr[i-1] == 6 && arr[i] == 7) {
                continue;
            }
            sum += arr[i];
        }
        
        System.out.println("Sum: " + sum);
        
        sc.close();
    }
}

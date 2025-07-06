package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays09 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] result = new int[n];
        int j = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] != 10) {
                result[j++] = arr[i];
            }
        }
        
        while(j < n) {
            result[j++] = 0;
        }
        
        System.out.print("Array after removing 10s: ");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        
        sc.close();
    }
}

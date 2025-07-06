package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays10 {
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
        int evenIndex = 0;
        int oddIndex = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                evenIndex++;
            } else {
                oddIndex++;
            }
        }
        
        int even = 0, odd = evenIndex;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] % 2 == 0) {
                result[even++] = arr[i];
            } else {
                result[odd++] = arr[i];
            }
        }
        
        System.out.print("Rearranged array: ");
        for(int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
        
        sc.close();
    }
}

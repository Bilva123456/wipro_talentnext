package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        
        System.out.println("Enter 4 integers for 2x2 array:");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("The given array is :");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int[][] reverse = new int[2][2];
        reverse[0][0] = arr[1][1];
        reverse[0][1] = arr[1][0];
        reverse[1][0] = arr[0][1];
        reverse[1][1] = arr[0][0];
        
        System.out.println("The reverse of the array is :");
        for(int i = 0; i < 2; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(reverse[i][j] + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
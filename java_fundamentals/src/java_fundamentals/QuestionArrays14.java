package java_fundamentals;
import java.util.Scanner;
public class QuestionArrays14 { 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 9 integer numbers:");
        String[] input = sc.nextLine().split(" ");
        
        if (input.length != 9) {
            System.out.println("O/P: Please enter 9 integer numbers");
            sc.close();
            return;
        }
        
        int[][] arr = new int[3][3];
        
        try {
            int index = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = Integer.parseInt(input[index++]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid integer numbers");
            sc.close();
            return;
        }
        
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        int biggest = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > biggest) {
                    biggest = arr[i][j];
                }
            }
        }
        
        System.out.println("The biggest number in the array is: " + biggest);
        
        sc.close();
    }
}
package oops_Inheritence;
import java.util.Scanner;

public class QuestionRemoveFirstLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        
        if (str == null || str.length() <= 2) {
            System.out.println("");
        } else {
            System.out.println(str.substring(1, str.length() - 1));
        }
        
        sc.close();
    }
}
package oops_Inheritence;
import java.util.Scanner;

public class QuestionString07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        
        if (str.length() > 0 && (str.charAt(0) == 'x' || str.charAt(str.length() - 1) == 'x')) {
            String result = str;
            if (str.charAt(0) == 'x') {
                result = result.substring(1);
            }
            if (result.length() > 0 && result.charAt(result.length() - 1) == 'x') {
                result = result.substring(0, result.length() - 1);
            }
            System.out.println(result);
        } else {
            System.out.println(str);
        }
        
        sc.close();
    }
}

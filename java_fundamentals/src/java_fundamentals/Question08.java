package java_fundamentals;
import java.util.Scanner;
public class Question08 {
  public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	char n = sc.next().charAt(0);
	if(Character.isAlphabetic(n)) {
		System.out.println("Alphabet");
	}else if(Character.isDigit(n)) {
		System.out.println("Digit");
	}else {
		System.out.println("Special Character");
	}
	sc.close();
  }
}

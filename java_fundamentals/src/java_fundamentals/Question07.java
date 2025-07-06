package java_fundamentals;
import java.util.Scanner;
public class Question07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char chr1 = sc.next().charAt(0);
		char chr2 = sc.next().charAt(0);
		if(chr1<chr2) {
			System.out.println(chr1+","+chr2);
		}else {
			System.out.println(chr2+","+chr1);
		}
     sc.close();
	}

}

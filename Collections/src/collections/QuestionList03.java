package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class QuestionList03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<String> stringList = new ArrayList<>();

        System.out.print("Enter number of strings: ");
int n = sc.nextInt();
sc.nextLine();  // consume leftover newline

for (int i = 0; i < n; i++) {
    System.out.print("Enter string " + (i + 1) + ": ");
    String str = sc.nextLine();
    stringList.add(str);
}

System.out.println("\nPrinting all strings using Iterator:");
        Iterator<String> it = stringList.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close();
    }
}
package collections;



import java.util.*;

class CardSum {
    private String symbol;
    private int number;

    public CardSum(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return symbol + " " + number;
    }
}

public class MiniProject01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<CardSum>> cardMap = new HashMap<>();

        System.out.println("Enter Number of Cards:");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ":");
            String symbol = sc.next();
            int number = sc.nextInt();

            CardSum card = new CardSum(symbol, number);

            cardMap.computeIfAbsent(symbol, k -> new ArrayList<>()).add(card);
        }

        TreeSet<String> sortedSymbols = new TreeSet<>(cardMap.keySet());
        System.out.println("Distinct Symbols are:");
        for (String symbol : sortedSymbols) {
            System.out.print(symbol + " ");
        }
        System.out.println();

        for (String symbol : sortedSymbols) {
            List<CardSum> cards = cardMap.get(symbol);
            System.out.println("Cards in " + symbol + " Symbol");

            int sum = 0;
            for (CardSum card : cards) {
                System.out.println(card);
                sum += card.getNumber();
            }
            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
        }

        sc.close();
    }
}
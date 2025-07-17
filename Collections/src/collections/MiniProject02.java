package collections;


import java.util.*;

class Card {
    private String symbol;
    private int number;

    public Card(String symbol, int number) {
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

public class MiniProject02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedHashSet<Card> cardSet = new LinkedHashSet<>();
        HashSet<String> symbolSet = new HashSet<>();

        int totalCards = 0;

        while (symbolSet.size() < 4) {
            System.out.println("Enter a card:");
            String symbol = sc.next();
            int number = sc.nextInt();

            Card card = new Card(symbol, number);
            cardSet.add(card);
            symbolSet.add(symbol);

            totalCards++;
        }

        System.out.println("Four symbols gathered in " + totalCards + " cards.");
        System.out.println("Cards in Set are:");

        TreeSet<Card> sortedCards = new TreeSet<>(Comparator.comparing(Card::getSymbol));
        sortedCards.addAll(cardSet);

        for (Card c : sortedCards) {
            System.out.println(c);
        }

        sc.close();
    }
}

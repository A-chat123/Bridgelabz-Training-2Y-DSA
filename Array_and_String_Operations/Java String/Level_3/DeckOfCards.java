import java.util.Scanner;

public class DeckOfCards {

    static final String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
    static final String[] ranks = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "Jack", "Queen", "King", "Ace"
    };

    public static String[] initializeDeck() {
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static void shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomIndex = i + (int)(Math.random() * (n - i));
            String temp = deck[i];
            deck[i] = deck[randomIndex];
            deck[randomIndex] = temp;
        }
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        int totalCards = numPlayers * cardsPerPlayer;
        if (totalCards > deck.length) {
            System.out.println("Not enough cards to distribute.");
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < cardsPerPlayer; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  - " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] deck = initializeDeck();
        shuffleDeck(deck);

        System.out.print("Enter number of players: ");
        int numPlayers = input.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = input.nextInt();
        input.close();

        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);
        if (players != null) {
            printPlayerCards(players);
        }
    }
}

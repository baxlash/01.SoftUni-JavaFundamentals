import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;


public class CardFrequencies {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        List<String> cards = Arrays.asList(console.nextLine().split(" "));

        HashMap<String, Integer> cardsCount = new HashMap<>();

        for (String card : cards) {
            String cardValue = null;
            for (int i = 0; i < card.length(); i++) {
                if (Character.isLetterOrDigit(card.charAt(i))) {
                    cardValue += card.charAt(i);
                }

            }
            if (cardsCount.get(cardValue) == null) {
                cardsCount.put(cardValue, 1);
            } else {
                cardsCount.put(cardValue, cardsCount.get(cardValue) + 1);
            }
        }

        cardsCount.entrySet().stream()
                .sorted((innerEntry1, innerEntry2) -> innerEntry1.getValue().compareTo(innerEntry2.getValue()))
                .forEach(entry -> {
                    System.out.println(String.format("%s -> %.2f%%", entry.getKey(), (entry.getValue().doubleValue() / cards.size()) * 100));
                });
    }
}


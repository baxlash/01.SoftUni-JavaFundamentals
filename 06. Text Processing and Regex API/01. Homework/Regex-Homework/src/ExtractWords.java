import java.util.Scanner;

/**
 * Problem 5.	Extract words
 * Write a program that extracts words from a string. Words are sequences of characters that are at least two symbols
 * long and consist only of English alphabet letters. Use regex.
 */
public class ExtractWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String regex = "[^A-Za-z]+";

        String[] words = input.split(regex);

        for (String word : words) {
            System.out.printf("%s ", word);
        }
    }
}

import java.util.Scanner;

/**
 * Problem 4.	Count All Words
 * Write a program to count the number of words in given sentence.
 * Use any non-letter character as word separator.
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String regex = "[\\W\\s]+";

        String[] words = input.split(regex);
        System.out.println(words.length);
    }


}

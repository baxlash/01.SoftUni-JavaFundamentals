import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem 6.	 Starts and Ends With Capital Letter
 * Write a program that takes as input an array of strings are prints only the words that start and end with
 * capital letter. Words are only strings that consist of English alphabet letters. Use regex.
 */
public class StartsEndsWithCapLet {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();
        String regex = "^([A-Z][A-Za-z]*[A-Z])$";
        String[] words = input.split(" ");


        for (String word : words) {
            Pattern pattern = Pattern.compile(regex);

            Matcher matcher = pattern.matcher(word);
            System.out.println(matcher.group());
        }

    }
}

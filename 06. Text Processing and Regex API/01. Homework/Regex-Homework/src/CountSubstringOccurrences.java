import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Problem 2.	Count Substring Occurrences
 * Write a program to find how many times given string appears in given text as substring. The text is given at the first input line.
 * The search string is given at the second input line.
 * The output is an integer number. Please ignore the character casing.

 */
public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().toLowerCase();
        String match = console.nextLine();

        int lastIndexOf = 0;
        int count = 0;

        while (lastIndexOf != -1){
            lastIndexOf = input.indexOf(match,lastIndexOf);

            if(lastIndexOf!=-1){
                count++;
                lastIndexOf ++;
            }
        }

        System.out.println(count);
    }
}

import java.util.Scanner;

/**
 * Problem 2.	Count Substring Occurrences
 * Write a program to find how many times given string appears in given text as substring.
 * The text is given at the first input line. The search string is given at the second input line.
 * The output is an integer number. Please ignore the character casing.
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine().toLowerCase();
        String match = console.nextLine();
        String regex = "[^A-Za-z0-9]";


        String[] parsed = input.split(regex);
        int count = 0;
        for (String item : parsed) {
            if(item.equals(match)){
                count++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem 1. Filter Array
 * Write a program that filters an array of strings,
 * leaving only the strings with length greater than 3 characters.
 * Use .filter()
 */
public class FilterArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        Arrays.stream(input.split(" "))
                .filter(p -> p.length()>3)
                .map(p -> p+" ")
                .forEach(System.out::print);
    }
}

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

/**
 * Problem 2.	Sort array with stream API
 * Use the .sorted() method to sort an array of integers.
 * The first line of input is the array. The second is the sorting order.
 */
public class SortArray {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        System.out.println("Ascending:");
        sortAscending(input);
        System.out.println("\r\n---------------------\r\nDescending:");
        sortDescending(input);
    }

    private static void sortAscending(String str) {
        Arrays.asList(str.split(" ")).stream()
                .map(toInteger())
                .sorted((p, q) -> p.compareTo(q))
                .map(p -> p + " ")
                .forEach(System.out::print);

    }

    private static void sortDescending(String str) {
        Arrays.asList(str.split(" ")).stream()
                .map(toInteger())
                .sorted((p, q) -> q.compareTo(p))
                .map(p -> p + " ")
                .forEach(System.out::print);

    }

    private static Function<String, Integer> toInteger() {
        return p -> Integer.parseInt(p);
    }
}

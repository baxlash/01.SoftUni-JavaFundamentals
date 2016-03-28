import java.util.Scanner;

/**
 * Created by Baxlash on 3/26/2016.
 */
public class CountAllWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputs = console.nextLine().split("[\\p{Punct}\\s]+");

        int count = 0;

        for (String input : inputs) {
            count++;
        }
        System.out.println(count);
    }
}

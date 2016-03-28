import java.util.Scanner;

/**
 * Created by Baxlash on 3/26/2016.
 */
public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputs = console.nextLine().toLowerCase().split("[\\p{Punct}\\s]+");
        String word = console.next();
        int count = 0;

        for (String input : inputs) {
            if(input.equals(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

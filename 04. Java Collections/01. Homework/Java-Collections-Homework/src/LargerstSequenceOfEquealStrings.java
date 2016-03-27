import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Baxlash on 27.3.2016 г..
 */
public class LargerstSequenceOfEquealStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");

        List<String> equalSequences = new ArrayList<>();

        String sequence = input[0];
        //System.out.print(input[0]);

        for (int i = 1; i < input.length; i++) {
            if (input[i].equals(input[i - 1])) {
                sequence += " " + input[i];
            } else {
                sequence = input[i];
            }
            equalSequences.add(sequence);
        }

        for (String equalSequence : equalSequences) {
            System.out.println(equalSequence);
        }
    }
}

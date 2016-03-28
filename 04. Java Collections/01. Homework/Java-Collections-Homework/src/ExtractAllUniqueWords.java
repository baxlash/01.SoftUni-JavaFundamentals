import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;


public class ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputs = console.nextLine().replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        Set<String> uniqueWords = new TreeSet<>();

        for (String input : inputs) {
            uniqueWords.add(input.toLowerCase());
        }
        for (String word : uniqueWords) {
            System.out.print(word + " ");
        }
    }
}

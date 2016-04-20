import java.util.*;

/**
 * Created by Baxlash on 13-Apr-16.
 */
public class ArrangeNumbers {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputNumbers = console.nextLine().split("\\D+");
        String[] numbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",};
        // List<String> output = new ArrayList<>();
        Map<String, List<String>> output = new TreeMap<>();
        for (String inputNumber : inputNumbers) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < inputNumber.length(); i++) {
                sb.append(numbers[inputNumber.charAt(i) - 48]);
                sb.append("-");
            }
            sb.delete(sb.length() - 1, sb.length());
            if (!output.containsKey(sb.toString())) {
                output.put(sb.toString(), new ArrayList<String>());
            }
            output.get(sb.toString()).add(inputNumber);

        }


    }
}

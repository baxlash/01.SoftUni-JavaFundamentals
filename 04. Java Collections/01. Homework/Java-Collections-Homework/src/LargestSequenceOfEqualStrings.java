import java.util.*;

public class LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] inputs = console.nextLine().split(" ");

        HashMap<String, Integer> sequences = new HashMap<>();

        sequences.put(inputs[0], 1);

        for (int i = 1; i < inputs.length; i++) {
            if (inputs[i].equals(inputs[i - 1])) {
                sequences.put(inputs[i], sequences.get(inputs[i]) + 1);
            } else {
                sequences.put(inputs[i], 1);
            }
        }


        List<Integer> values = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : sequences.entrySet()) {
            values.add(entry.getValue());
        }

        int maxValue = 0;
        if (values.size() == 1) {
            maxValue = values.get(0);
        } else {
            for (int i = 0; i < values.size() - 1; i++) {
                maxValue = Math.max(maxValue, values.get(i));
            }
        }

        for (Map.Entry<String, Integer> entry : sequences.entrySet()) {
            if (entry.getValue() == maxValue) {
                for (int i = 0; i < maxValue; i++) {
                    System.out.print(entry.getKey() + " ");
                }
                break;
            }
        }
    }
}

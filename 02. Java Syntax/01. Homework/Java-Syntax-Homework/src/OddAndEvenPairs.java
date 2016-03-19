import java.util.Scanner;

/**
 * Created by Baxlash on 19.3.2016 г..
 */
public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputSplitted = input.split(" ");
        int[] numbers = new int[inputSplitted.length];
        scanner.close();

        if (inputSplitted.length % 2 != 0) {
            System.out.println("Invalid length");
        } else {
            for (int i = 0; i < inputSplitted.length; i++) {
                numbers[i] = Integer.parseInt(inputSplitted[i]);
            }

            Tuple<Integer, Integer>[] pairs = new Tuple[numbers.length / 2];

            int[] subArrayEvenIndices = new int[numbers.length / 2];
            int[] subArrayOddIndices = new int[numbers.length / 2];


            for (int i = 0; i < numbers.length / 2; i++) {
                subArrayEvenIndices[i] = numbers[i * 2];
                subArrayOddIndices[i] = numbers[(i * 2) + 1];
            }

            for (int i = 0; i < numbers.length / 2; i++) {
                if ((subArrayEvenIndices[i] % 2) != (subArrayOddIndices[i] % 2)) {
                    System.out.printf("%d, %d -> different\n", subArrayEvenIndices[i], subArrayOddIndices[i]);
                } else {
                    if (subArrayEvenIndices[i] % 2 == 0) {
                        System.out.printf("%d, %d -> both are even\n", subArrayEvenIndices[i], subArrayOddIndices[i]);
                    } else {
                        System.out.printf("%d, %d -> both are odd\n", subArrayEvenIndices[i], subArrayOddIndices[i]);
                    }
                }
            }
        }
    }
}
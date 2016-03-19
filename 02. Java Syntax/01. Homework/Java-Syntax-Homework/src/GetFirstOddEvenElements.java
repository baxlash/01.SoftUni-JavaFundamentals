import java.util.Scanner;

/**
 * Created by Baxlash on 19.3.2016 г..
 */
public class GetFirstOddEvenElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String format = scanner.nextLine();
        scanner.close();

        String[] inputSplitted = input.split(" ");
        String[] formatSplitted = format.split(" ");

        int[] numbers = new int[inputSplitted.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(inputSplitted[i]);
        }

        String result = new String();

        for (int i = 0; i < numbers.length; i++) {
            int iter = Integer.parseInt(formatSplitted[1]);
            if (iter == 0) {
                break;
            }

            switch (formatSplitted[2]) {
                case "odd":
                    if (numbers[i] % 2 != 0) {
                        result += numbers[i] + " ";
                    }
                    break;
                case "even":
                    if (numbers[i] % 2 == 0) {
                        result += numbers[i] + " ";
                    }
                    break;
                default:
                    break;
            }
            iter--;
        }

        System.out.println(result);
    }
}

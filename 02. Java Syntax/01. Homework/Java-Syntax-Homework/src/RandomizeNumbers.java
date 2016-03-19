import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Baxlash on 19.3.2016 г..
 */
public class RandomizeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int borderOne = scanner.nextInt();
        int borderTwo = scanner.nextInt();
        scanner.close();
        int start = Math.min(borderOne, borderTwo);

        int range = Math.abs(borderOne - borderTwo + 1);
        int[] numbers = new int[range];

        for (int i = 0; i < range; i++) {
            numbers[i] = start + i;
        }

        int[] result = shuffleArray(numbers);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }

    static int[] shuffleArray(int[] arr) {
        Random random = ThreadLocalRandom.current();

        for (int i = arr.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int a = arr[index];
            arr[index] = arr[i];
            arr[i] = a;
        }

        return arr;
    }
}

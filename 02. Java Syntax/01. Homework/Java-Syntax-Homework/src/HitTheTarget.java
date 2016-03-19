import java.util.Scanner;

/**
 * Created by Baxlash on 19.3.2016 г..
 */
public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i + j == input) {
                    System.out.printf("%d + %d = %d\n", i, j, input);
                }
            }
        }

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                if (i - j == input) {
                    System.out.printf("%d - %d = %d\n", i, j, input);
                }
            }
        }
    }
}

import java.util.Scanner;

/**
 * Created by Baxlash on 18.3.2016 г..
 */
public class ConvertToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        String result = Integer.toString(input, 7);

        System.out.println("result = " + result);
    }
}

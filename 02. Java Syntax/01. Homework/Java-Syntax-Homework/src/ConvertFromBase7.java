import java.util.Scanner;

/**
 * Created by Baxlash on 18.3.2016 г..
 */
public class ConvertFromBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        scanner.close();

        int result = convertFromBase7ToBase10(input);

        System.out.println("result = " + result);
    }

    static int convertFromBase7ToBase10(String number) {
        int result = 0;
        int base = 7;

        for (int i = 0; i < number.length(); i++) {
            result += (number.charAt(number.length() - i - 1) - 48) * Math.pow(base, i);
        }
        return result;
    }
}

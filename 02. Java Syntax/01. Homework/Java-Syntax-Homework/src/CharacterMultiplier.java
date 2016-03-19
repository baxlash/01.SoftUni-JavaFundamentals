import java.util.Scanner;

/**
 * Created by Baxlash on 19.3.2016 г..
 */
public class CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.next();
        String str2 = scanner.next();
        scanner.close();

        int result = 0;

        int diff = Math.abs(str1.length() - str2.length());

        if (diff == 0) {
            for (int i = 0; i < str1.length(); i++) {
                result += str1.charAt(i) * str2.charAt(i);
            }
        } else {
            for (int i = 0; i < compareStringLength(str1, str2).length(); i++) {
                result += str1.charAt(i) * str2.charAt(i);
            }
            if (str1.length() > str2.length()) {
                for (int i = compareStringLength(str1, str2).length(); i < str1.length(); i++) {
                    result += str1.charAt(i);
                }
            } else {
                for (int i = compareStringLength(str1, str2).length(); i < str2.length(); i++) {
                    result += str2.charAt(i);
                }
            }
        }

        System.out.println(result);
    }

    static String compareStringLength(String s1, String s2) {
        if (s1.length() < s2.length())
            return s1;
        else
            return s2;
    }
}

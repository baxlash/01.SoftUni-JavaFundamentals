import java.util.Scanner;

public class CombineListsOfLetters {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String firstLine = console.nextLine().replaceAll(" ", "");
        String secondLine = console.nextLine().replaceAll(" ", "");

        System.out.println(combine(firstLine, secondLine));
    }

    private static String combine(String s1, String s2) {

        String combined = s1;
        int count = s2.length();
        while (count > 0) {
            String common = s2.substring(0, count);
            if (s1.endsWith(common)) {
                combined = s1 + s2.substring(count);
                break;
            }
            count--;
        }

        return combined;
    }

}

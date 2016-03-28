import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FilterArray {
    private static boolean isNumber(String str) {
        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");

        List<Integer> numbers = Arrays.stream(input)
                .filter(FilterArray::isNumber)
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int sum = numbers.stream().mapToInt(Integer::intValue).sum();

        System.out.println(sum);


    }
}

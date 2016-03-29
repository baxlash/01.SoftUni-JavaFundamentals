import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");
        int number = Integer.parseInt(input[0]);

        List<List<Integer>> numbersList = new ArrayList<>();
        List<Integer> increasingList = new ArrayList<>();
        increasingList.add(number);


        for (int i = 1; i < input.length; i++) {

            if (Integer.parseInt(input[i]) > number) {
                increasingList.add(Integer.parseInt(input[i]));
            } else {
                numbersList.add(increasingList);
                increasingList = new ArrayList<>();
                increasingList.add(Integer.parseInt(input[i]));
            }
            number = Integer.parseInt(input[i]);
        }
        numbersList.add(increasingList);

        List<Integer> longest = numbersList.stream()
                .max(Comparator.comparing(item -> item.size()))
                .get();


        for (List<Integer> list : numbersList) {
            for (Integer item : list) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }


        System.out.printf("Longest: ");
        for (Integer integer : longest) {
            System.out.printf("%d ", integer);
        }
    }
}

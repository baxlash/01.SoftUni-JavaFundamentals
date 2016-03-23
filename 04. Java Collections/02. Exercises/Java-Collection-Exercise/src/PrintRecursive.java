import java.util.Scanner;

public class PrintRecursive {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();

        print(number);
    }

    private static void print(int number) {
        if (number < 1) {
            return;
        }
        print(number - 1);
        System.out.println(number);


    }
}

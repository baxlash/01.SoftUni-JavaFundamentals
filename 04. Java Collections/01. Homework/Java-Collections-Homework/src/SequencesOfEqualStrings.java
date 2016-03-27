import java.util.Scanner;


public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] input = console.nextLine().split(" ");

        System.out.print(input[0]);

        for (int i = 1; i < input.length; i++) {
            if(input[i].equals(input[i-1])){
                System.out.print(" "+input[i]);
            }else{
                System.out.println();
                System.out.print(input[i]);
            }
        }
    }
}

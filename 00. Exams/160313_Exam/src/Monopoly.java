import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Baxlash on 19.4.2016 г..
 */
public class Monopoly {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String line = console.nextLine();
        int rows = Integer.parseInt(line.split(" ")[0]);
        int cols = Integer.parseInt(line.split(" ")[0]);

        List<String> matrix = new ArrayList<>();

        int money = 50;
        int turns = 0;
        int hotels = 0;

        for (int i = 0; i < rows; i++) {
            line = console.nextLine();
            if (i % 2 == 0) {
                matrix.add(line);
            } else {
                matrix.add(reverse(line));
            }
        }

        for (String s : matrix) {
            for (int i = 0; i < s.length(); i++) {
                switch (s.charAt(i)) {
                    case 'H':
                        hotels++;
                        String output = String.format("Bought a hotel for %d. Total hotels: %d.", money, hotels);
                        System.out.println(output);
                        money = 0;
                        break;
                    case 'J':
                        output = String.format("Gone to jail at turn %d.", turns);
                        System.out.println(output);
                        turns += 2;
                        money += hotels * 20;
                        break;
                    case 'S':
                        int spentMoney;
                        if (matrix.indexOf(s) % 2 != 0) {
                            spentMoney = (matrix.indexOf(s) + 1) * (cols - i+2);
                        } else {
                            spentMoney = (matrix.indexOf(s) + 1) * (i + 1);
                        }
                        money -= spentMoney;
                        output = String.format("Spent %d money at the shop.", spentMoney);
                        System.out.println(output);
                        break;
                    default:
                        break;
                }
                money += hotels * 10;
                turns++;
            }
        }
        //money = turns * hotels * 10;
        System.out.println("Turns " + turns);
        System.out.println("Money " + money);

    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        return sb.reverse().toString();
    }
}

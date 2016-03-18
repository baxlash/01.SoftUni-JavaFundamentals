import java.util.Scanner;

public class PrintCharTriagle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();

		for (int i = 0; i < number; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) (97 + j) + " ");
			}
			System.out.println();
		}
		for (int i = number - 1; i >= 0; i--) {
			for (int j = 0; j < i; j++) {
				System.out.print((char) (97 + j) + " ");
			}
			System.out.println();
		}
	}
}

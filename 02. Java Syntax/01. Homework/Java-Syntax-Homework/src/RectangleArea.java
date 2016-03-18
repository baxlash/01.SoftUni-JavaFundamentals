import java.util.Scanner;

public class RectangleArea {
	public static void main(String[] args) {
		System.out.print("Enter the length: ");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		System.out.print("Enter the height: ");
		int height = scan.nextInt();
		scan.close();
		
		System.out.printf("The are of the rectangle with length %s and height %s is %s", length, height, length*height);
	}
}

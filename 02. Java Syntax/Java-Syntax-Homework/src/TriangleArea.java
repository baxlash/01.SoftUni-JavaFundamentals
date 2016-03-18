import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		System.out.print("Enter the length of a side: ");
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		System.out.print("Enter the height to the same side: ");
		int height = scan.nextInt();
		scan.close();
		
		System.out.printf("The are of the triangle with sidelength %s and sideheight %s is %s", length, height, (length*height)/2);
	}
}

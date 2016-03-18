import java.util.Scanner;

public class FormattingNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firstNumber = Integer.parseInt(scanner.next());
		double secondNumber = Double.parseDouble(scanner.next());
		double thirdNumber = Double.parseDouble(scanner.next());
		scanner.close();
		
		String binary = String.format("%10s",Integer.toBinaryString(firstNumber)).replace(' ', '0');
		
		System.out.printf("|%-10s|%10s|%10.2f|%-10.3f|", Integer.toHexString(firstNumber).toUpperCase(), binary,secondNumber,thirdNumber);
		
	}
}

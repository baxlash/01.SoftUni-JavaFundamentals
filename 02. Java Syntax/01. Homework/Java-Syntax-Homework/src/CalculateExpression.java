import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
	public static void main(String[] args) {
		Locale.setDefault(Locale.ROOT);
		Scanner scanner = new Scanner(System.in);
		double a = scanner.nextDouble();
		double b = scanner.nextDouble();
		double c = scanner.nextDouble();
		scanner.close();
		
		double f1Result = formulae1(a, b, c);
		double f2Result = formulae2(a, b, c);
		
		double averageInputs = average(a, b, c);
		double averageResults = average(f1Result, f2Result);
		
		System.out.printf("F1 result: %.2f; F2 result: %.2f; Diff: %.2f", f1Result,f2Result,averageResults-averageInputs);
	}

	static double formulae1(double a, double b, double c) {
		double partOne = (Math.pow(a, 2) + Math.pow(b, 2));
		double partTwo = (Math.pow(a, 2) - Math.pow(b, 2));
		double partThree = (a + b + c) / Math.sqrt(c);

		return Math.pow(partOne / partTwo, partThree);
	}

	static double formulae2(double a, double b, double c) {
		double aToSquare = Math.pow(a, 2);
		double bToSquare = Math.pow(b, 2);
		double cToCube = Math.pow(c, 3);

		return Math.pow(aToSquare + bToSquare - cToCube, a - b);
	}

	static double average(double a, double b) {
		return (a + b) / 2;
	}

	static double average(double a, double b, double c) {
		return (a + b + c) / 3;
	}
}

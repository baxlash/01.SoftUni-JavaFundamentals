import java.util.Scanner;

public class TriangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        Tuple<Integer, Integer> A = new Tuple(scan.nextInt(), scan.nextInt());
        Tuple<Integer, Integer> B = new Tuple(scan.nextInt(), scan.nextInt());
        Tuple<Integer, Integer> C = new Tuple(scan.nextInt(), scan.nextInt());
        scan.close();

        double result = triangleArea(A, B, C);

        System.out.printf("result = %.0f", result);
    }

    static double triangleArea(Tuple<Integer, Integer> A, Tuple<Integer, Integer> B, Tuple<Integer, Integer> C) {
        double area = Math.abs((A.x * (B.y - C.y) + B.x * (C.y - A.y) + C.x * (A.y - B.y)) / 2);
        return area;
    }
}

class Tuple<X, Y> {
    public final X x;
    public final Y y;

    public Tuple(X x, Y y) {
        this.x = x;
        this.y = y;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GetAverage {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String[] splitted = str.split(" ");
		List<Float> input =  new ArrayList<Float>();
		for (int i = 0; i < splitted.length; i++) {
			input.add(Float.parseFloat(splitted[i]));
		}
		scan.close();
		
		System.out.println(String.format("%.2f", average(input)));
	}
	
	public static float average(List<Float> numbers){
		float result=0;
		for (Float number : numbers) {
			result +=number;
		}
		result/=numbers.size();
		
		return result;
	}
}

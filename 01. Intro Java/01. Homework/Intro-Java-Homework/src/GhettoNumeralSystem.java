import java.util.Scanner;

public class GhettoNumeralSystem {
	public static void main(String[] args) {
		String[] ghettoNumbers = new String[]{"Gee","Bro","Zuz","Ma","Duh","Yo","Dis","Hood","Jam","Mack"};
		
		Scanner sc = new Scanner(System.in);
		String number = sc.next();
		sc.close();
		
		String[] numbers = number.split(""); 
		String result = new String();
		
		for (int i = 0; i< numbers.length; i++){
			int index = Integer.parseInt(numbers[i]);
			result += ghettoNumbers[index];
		}
		
		System.out.println(result);

	}
	

}

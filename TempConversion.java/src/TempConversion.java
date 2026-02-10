import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double F, C, K;

		System.out.println("What is the Temperature in Fahrenheit?");
		F = input.nextDouble();
		//Celcius is (F - 32) times (5/9)
		C = (F - 32) * 5 /9;
		//Kelvin is Celcius + 273.15
		K = C + + 273.15;
		System.out.printf("It is %.2f Celcius and %.2f Kelvin when it is %.2f Fahrenheit", C, K, F);
		
	}
}

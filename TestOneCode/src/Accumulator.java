import java.util.Scanner;

public class Accumulator {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in numbers and I will add them, until you enter in a zero.");
		double userInput = 1, count = 0;
		while (userInput != 0) {
			
			System.out.println("Enter in your number here: ");
			userInput = input.nextDouble();
			
			count = count + userInput;
		}
		System.out.println("The sum of your numbers is: " + count);
		
	}

}

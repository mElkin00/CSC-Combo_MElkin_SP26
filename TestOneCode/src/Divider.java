import java.util.Scanner;

public class Divider {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in two numbers that you want to divide: ");
		float input1 = input.nextFloat();
		float input2 = input.nextFloat();
		float answer = input1/input2;
		
		if(input2 == 0) {
			System.out.println("You cannot divide by zero");
		}
		else {
			System.out.printf("The answer is %.2f", answer);
			System.out.printf(" when you divide %.2f", input1);
			System.out.printf(" by %.2f", input2);
		}

	}

}

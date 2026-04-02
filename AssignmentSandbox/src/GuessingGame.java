import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
// TODO write a program where the computer generates a number and the user guesses it
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 1;
		
		Random num = new Random();
		int comNum = num.nextInt(8) + 1;
		
		
		//System.out.println(comNum);
		System.out.println("I am thinking of a number between 0 and 10.");
		System.out.print("Enter in a number and I will tell you if you are right: ");
		int n = input.nextInt();
		
		while(n != comNum) {
			if(comNum < n) {
				System.out.println("Lower");
			}
			else {
				System.out.println("Higher");
			}
			count++;
			n = input.nextInt();
		}
		
		System.out.println("You got it in " + count + " tries!");
		

	}

}

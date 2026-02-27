import java.util.Scanner;

public class BeverageSelector {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int drink;
		
		System.out.println("Enter in a number to choose your drink. ");
		System.out.println("(1) Water (2) Coke (3) Coffee");
		drink = input.nextInt();
		
		if(drink == 1) {
			System.out.println("You chose water as your drink.");
		}
		else if(drink == 2) {
			System.out.println("You chose Coke as your drink.");
		}
		else if(drink == 3) {
			System.out.println("You chose Coffee as your drink.");
		}
		else {
			System.out.println("Your drink choice was invalid.");
		}

	}

}

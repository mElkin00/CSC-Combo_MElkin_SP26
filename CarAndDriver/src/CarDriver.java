import java.util.ArrayList;
import java.util.Scanner;

public class CarDriver {

	public static void main(String[] args) {
		//create a Scanner for input
		Scanner input = new Scanner(System.in);
		//create an ArrayList of Car objects called "cars" use .append to add to ArrayList
		ArrayList<Car> cars = new ArrayList<>();
		//create the two double variables mpg and fuel
		double mpg;
		double fuel;
		//create the String variable name
		String name;
		String another = "y";
		Car car = null;
		/* 
		 * using appropriate prompts get input from the user to fill in these variables
		 * you do not need input validation we will assume the user enters the data correctly
		 * 
		 */
		
		/*
		 * use a loop to gather the information to create a Car object and store it in cars
		 * asks if they would like to enter another.
		 * keep looping as long as the user answers 'y' or "yes"
		 */
		while(another.charAt(0) == 'y') {
			System.out.print("Enter in the name of the car: ");
			name = input.next();
			System.out.print("Enter in the miles per gallon: ");
			mpg = input.nextDouble();
			System.out.print("Enter in the amount of fuel: ");
			fuel = input.nextDouble();
			car = new Car(fuel, mpg, name);
			System.out.print("Would you like to enter in another car? ");
			another = input.next();
			another = another.toLowerCase();
		}
		
		
		
		/* 
		 * create a method to print out all the cars in the list
		 * 
		 * hint use: for(car : cars)
		 * 
		 */
		for(Car car1 : cars) {
			getPrinter(car1);
		}
		System.out.println(car);
		
		// print the list
		
		// access one element of the cars list and have it move a number of units
		
		// print the list again to see the change in fuel
			
	}
	
	public static void print(Car cars) {
		System.out.println(cars);
	}
	
	public static  void getPrinter(Car cars) {
		System.out.println("Name: " + cars.getName());
		System.out.println("\nMPG: " + cars.getMpg());
		System.out.println("\nFuel: " + cars.getFuel());
	}

}

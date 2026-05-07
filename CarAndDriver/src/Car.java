import java.util.Random;

public class Car {
	
	//create two private double instance variables called mpg and fuel
	//create a String variable called name
	private double mpg;
	private double fuel;
	Random rand = new Random();
	
	//generate a constructor using the variables you created.
	public Car(double mpg, double fuel) {
		super();
		this.mpg = mpg;
		this.fuel = fuel;
	}
	
	//generate a setters and getters for all variables
	public double getMpg() {
		return mpg;
	}

	public void setMpg(double mpg) {
		this.mpg = mpg;
	}

	public double getFuel() {
		return fuel;
	}

	public void setFuel(double fuel) {
		this.fuel = fuel;
	}
	
	public void drive(int moves) {
		int times = rand.nextInt(2, 10);
		int direction = 0;
		while(times != 0) {
			direction = rand.nextInt(4);
			switch(direction) {
			case 0:
				System.out.println("_North");
				break;
			case 1:
				System.out.println("_South");
				break;
			case 2:
				System.out.println("_East");
				break;
			default:
				System.out.println("_West");
				break;
			}
			mpg = mpg -0.2;
		}
			
	}
	
	
	
	/*
	 * create a method called drive that takes an int called moves
	 * 
	 * in this method create a loop that loops moves times 
	 * each loop should create a random number between 0 and 3 inclusive
	 * then using either a switch or an if-else chain print to the console 
	 * "_North", "_South", "_East", or "_West" according to the random number
	 * for each move fuel will lose 0.2 units
	 *  
	 */
	
	/*
	 * Generate the toString that prints the current state of the car.
	 * It should contain all the variables and look similar to this:
	 * 
	 * 		Name: MyCar
	 * 		MPG: 15
	 * 		Fuel: 25
	 * 		
	 * the actual values can be what ever you want I used "MyCar", 15, and 25 only as examples
	 * yours can be different. 
	 */
			

}

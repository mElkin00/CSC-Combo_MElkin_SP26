import java.util.Random;

public class Car {
	
	//create two private double instance variables called mpg and fuel
	//create a String variable called name
	private double mpg;
	private double fuel;
	String name = "";
	Random rand = new Random();
	
	//generate a constructor using the variables you created.
	public Car() {
		super();
		this.mpg = 0;
		this.fuel = 0;
		this.name = "";
	}
	
	public Car(double mpg, double fuel, String name) {
		super();
		this.mpg = mpg;
		this.fuel = fuel;
		this.name = name;
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
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
	public void drive(int moves) {
		int times = rand.nextInt(2, 7);
		int direction = 0;
		for(int i =0; i < times; i++) {
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
			fuel = fuel - 0.2;
		}
			
	}
	
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
	@Override
	public String toString() {
		return "Name: " + name + 
				"\nMPG: " + mpg +
				"\nFuel: " + fuel;
	}

}

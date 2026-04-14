import java.util.ArrayList;
import java.util.Scanner;

public class AnimalFarm {

	public static void main(String[] args) {
		ArrayList<Animal> farm = new ArrayList<>();
		int dogCount = 0;
		int catCount = 0;
		Scanner input = new Scanner(System.in);

		farm.add(new Cat2(7, 1, "Fluffy", true));
		farm.add(new Dog2(35, 2, "Fido", false));
		farm.add(new Animal(75, 3, "Ugg"));
		printFarm(farm);

		System.out.println("What is their weight?");
		int weight = input.nextInt();

		System.out.println("What is their height?");
		int height = input.nextInt();

		System.out.println("What is their name?");
		String name = input.next();

		System.out.println("Is this a dog(1) or a cat(2)?");
		int choice = input.nextInt();

		if (choice == 1) {
			System.out.println("Will the dog play fetch?");
			boolean fetch = input.nextBoolean();
			farm.add(new Dog2(weight, height, name, fetch));
		} else if (choice == 2) {
			System.out.println("Will the cat play?");
			boolean play = input.nextBoolean();
			farm.add(new Cat2(weight, height, name, play));
			catCount++;
		} else
		{
			farm.add(new Animal(weight, height, name));
		}
		printFarm(farm);
		// printArray(cats);
		// printArray(dogs);
		input.close();
	}

	private static void printFarm(ArrayList<Animal> farm) {
		for (Animal ani : farm) {
			System.out.println(ani);
		}
	}

	
}

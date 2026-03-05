package wk5_class;

import java.util.Scanner;

public class BottlesOfBeer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numBtls, btlsCopy;
		System.out.print("Enter the number of bottles to start with: ");
		numBtls = input.nextInt();
		btlsCopy = numBtls;
		
		for (int i = numBtls; i >= 0; i--) {
			
			if(numBtls == 2) {
				System.out.println(numBtls + " bottles of beer on the wall, " + numBtls + " bottles of beer.");
				numBtls = numBtls - 1;
				System.out.println("Take one down and pass it around, " + numBtls + " bottle of beer on the wall.");
				System.out.println(numBtls + " bottle of beer on the wall, " + numBtls + " bottle of beer.");
			}
			
			else if(numBtls == 1) {
				numBtls = numBtls - 1;
				System.out.println("Take one down and pass it around, " + numBtls + " bottles of beer on the wall.");
				System.out.println(numBtls + " bottles of beer on the wall, " + numBtls + " bottles of beer.");
			}
			else if(numBtls == 0) {
				System.out.println("Go to the store and buy some more, " + btlsCopy + " bottles of beer on the wall.");
			}

			else {
				System.out.println(numBtls + " bottles of beer on the wall, " + numBtls + " bottles of beer.");
				numBtls = numBtls - 1;
				System.out.println("Take one down and pass it around, " + numBtls + " bottles of beer on the wall.");
			}
		}

	}
	
}

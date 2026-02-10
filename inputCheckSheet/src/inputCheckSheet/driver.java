package inputCheckSheet;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter in a sentence");
		String word = input.nextLine();
		/*
		 * if you put next it will take everything until the next white space if you put
		 * nextLine it will take the entire sentence
		 */
		word = word.toUpperCase();
		System.out.println(word);

		System.out.println("Enter in a whole number");
		int intNum = input.nextInt();
		//if you put in a string for an int, you get an error because it wants a number
		System.out.println(intNum);

		/*
		 * System.out.println("Enter in a number with a decimal point"); float realNum =
		 * input.nextFloat();
		 * //if you put in a string for a float, you get an error
		 * //because it wants a number
		 * 
		 */
		System.out.println("Float");
		float realNum = 98765431.987654321f;
		realNum = realNum + realNum;
		System.out.println(realNum);
		System.out.printf("%.2f\n", realNum);
		System.out.printf("%.9f\n", realNum);
		// at %.2 the output is 197530864.00
		// at %.9 the output is 197530864.000000000

		/*
		 * System.out.println("Enter in a really big number"); double biggerRealNum =
		 * input.nextDouble();
		 * double biggerRealNum = 987654321.987654321; biggerRealNum = biggerRealNum +
		 * biggerRealNum;
		 *	// if you put in a string for a double, you get an error
		 *	// because it wants a number
		*/
		System.out.println("Double");
		double biggerRealNum = 987654321.987654321;
		biggerRealNum = biggerRealNum + biggerRealNum;
		System.out.printf("%.2f\n", biggerRealNum);
		System.out.printf("%.9f\n", biggerRealNum);
		// entering in 3.469 rounds it to 3.47
		// entering in 3.4499 rounds it to 3.45

		/*
		 * The reason that we get 197530864.000000000 for the float instead of
		 * 1975308643.975308700 is because the float cannot handle numbers that big, but
		 * the double can
		 */

		System.out.println("Enter a letter");
		char letter = input.next().charAt(0);
		System.out.println(letter);

	}

}

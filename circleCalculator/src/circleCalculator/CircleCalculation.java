package circleCalculator;

import java.util.Scanner;

public class CircleCalculation {

	public static void main(String[] args) {
		// Project for calculating the diameter, area, and circumference of a circle
		
		Scanner input = new Scanner(System.in);
		double r, d, a, c;
		
		System.out.println("Enter in the radius of the circle.");
		
		r = input.nextDouble();
		
		//diameter is 2 * radius
		d = r * 2;
		System.out.printf("The diameter of the circle is: %.3f\n", d);
		
		//area is pi * radius squared
		a = Math.PI * (r * r);
		System.out.printf("The area of the circle is: %.3f\n", a);
		
		//circumference = 2 * pi * radius
		c = 2 * Math.PI * r;
		System.out.printf("The circumference of the circle is: %.3f", c);

	}

}

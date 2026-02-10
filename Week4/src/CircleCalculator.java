import java.util.Scanner;

public class CircleCalculator {

	public static void main(String[] args) {
		
		System.out.print("Enter in the radius : ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		
		double dia = calculateDia(radius);
		System.out.println(dia);
		
		double area = calculateArea(radius);
		System.out.println(area);
		
		double circ = calculateCir(radius);
		System.out.println(circ);
		
	}

	private static double calculateDia(double radius) {
		System.out.print("The diameter is: ");
		double result = 2 * radius;
		return result;
	}

	private static double calculateCir(double radius) {
		System.out.print("The circumference is: ");
		double result = Math.PI * radius * 2;
		return result;
	}

	private static double calculateArea(double radius) {
		System.out.print("The area is: ");
		double result = Math.PI * (radius * radius);
		return result;
	}

}

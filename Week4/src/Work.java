import java.util.Scanner;

public class Work {

	public static void main(String[] args) {
		/************************
		 *						*
		 * @author Mason Elkin	*
		 * 2/11/2026			*
		 * 						*
		 ************************/
		
		
		/************************************************************************
		 * Write a Java program to get a number from the user and print whether	*
		 * it is positive or negative.  main() should call a method named 		*
		 * isPositive() that will return whether the number is positive.		*
		 * (Call the class Exercise1)											*
		 ************************************************************************/
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter in a number and I will tell you if it is positive or negative: ");
		int num = input.nextInt();
		
		boolean pos = isPositive(num);
		System.out.print("Your number is");
		if(pos)System.out.println(" positive");
		else System.out.println(" negative");
		
		/********************************************************************************
		 * Take three numbers from the user and print the greatest number.				*
		 * main() should call a method named greatestNumber() that takes				*
		 * the 3 numbers and returns the greatest number. (Call the class Exercise2)	*
		 ********************************************************************************/
		
		System.out.println("Enter three numbers I will tell you the greatest one:");
		num = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		System.out.println(greatestNum(num, num2, num3));
		
		
		/********************************************************************
		 * Write a Java program that reads a floating-point number and		*
		 * prints "zero" if the number is zero. Otherwise, print			*
		 * "positive" or "negative" if the number is positive or negative	*
		 * respectively. Add "small" if the absolute value of the number	*
		 * is less than 1, or "large" if it exceeds 1,000,000				*
		 * (Call the class Exercise3)										*
		 ********************************************************************/
		
		System.out.print("Enter a float: ");
		double real = input.nextDouble();
		System.out.println(realpositive(real));
		
		/********************************************************************
		 * Write a Java program that reads a number from the user			*
		 * between 1 and 7, calls a method called getWeekDay()				*
		 * to get the day of the week corresponding to the number,			*
		 * and displays the name of the weekday. (Call the class Exercise4)	*
		 ********************************************************************/
		System.out.print("Enter a number between 1 and 7 and I will tell you the day of the week: ");
		int dayNum = input.nextInt();
		System.out.println(getWeekDay(dayNum));
		
	}

	private static String getWeekDay(int dayNum) {
		String ret = null;
		switch(dayNum) {
			case 1:
				ret = "Sunday";
				break;
			case 2:
				ret = "Monday";
				break;
			case 3:
				ret = "Tuesday";
				break;
			case 4:
				ret = "Wednesday";
				break;
			case 5:
				ret = "Thursday";
				break;
			case 6:
				ret = "Friday";
				break;
			case 7:
				ret = "Saturday";
				break;
		}
		return ret;
	}

	private static String realpositive(double real) {
		String ret = "";
		if(real > 0) ret += "positive, ";
		else if(real == 0) ret += "zero, ";
		else if(real < 0) ret += "negative, ";
		
		if(Math.abs(real) < 1) ret += "small";
		else if(Math.abs(real) > 1000000) ret += "large";
		
		return ret;
	}

	private static int greatestNum(int num, int num2, int num3) {
		if(num > num2 && num > num3)return num;
		if(num2 > num && num2 > num3)return num2;
		return num3;
	}

	private static boolean isPositive(int num) {
		return num >= 0;
	}

}

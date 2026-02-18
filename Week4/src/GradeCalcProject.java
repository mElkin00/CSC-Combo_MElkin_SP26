import java.util.Scanner;

public class GradeCalcProject {

	public static void main(String[] args) {
		// My project for grade calculations CSC 1060
		
		String letter, symbol;
		letter = "";
		symbol = "";
		
		System.out.println("Enter in your numeric grade: ");
		Scanner input = new Scanner(System.in);
		float grade = input.nextFloat();
		
		
		//if the grade entered is less than 0, the program will not go through its checks
		if (grade < 0) {
			System.out.println("There was an error calculating your grade.");
		}
		
		//if the grade is 0 or greater, it will run checks for what the grade is
		else {
			
			if (grade >= 90) {
				letter = "A";
				if (grade < 92) {
					symbol = "-";
				}
			}
			
			else (grade >= 80 && grade < 90) {
				letter = "B";
				if (grade >= 87) {
					symbol = "+";
				}
				if (grade < 82) {
					symbol = "-";
				}
			}
			
			else (grade >= 70 && grade < 80) {
				letter = "C";
				if (grade >= 77) {
					symbol = "+";
				}
				if (grade < 72) {
					symbol = "-";
				}
			}
			
			else (grade >= 60 && grade < 70) {
				letter = "D";
				if (grade >= 67) {
					symbol = "+";
				}
			}
			else (grade < 60) {
				letter = "F";
			}
			
			System.out.println("Your grade letter is: " + letter + symbol);
		}
	}

}

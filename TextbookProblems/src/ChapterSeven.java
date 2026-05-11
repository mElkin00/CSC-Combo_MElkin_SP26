import java.util.Scanner;

public class ChapterSeven {

	public static void main(String[] args) {
		
		arePrimeFactors();
		if(arePrimeFactors() == true) System.out.println("True");
		else System.out.println("False");
		
		areAnnograms();
	}

	private static void areAnnograms() {
		Scanner input = new Scanner(System.in);
		String str = input.next();
		
	}

	private static boolean arePrimeFactors() {
		/*TODO
		 * 
		 * Write a method named arePrimeFactors that takes an integer
		 * n and an array of integers, and that returns true if the numbers in the array
		 * are all prime and their product is n
		 * 
		 */
		Scanner input = new Scanner(System.in);
		int n = 30;
		int[] arr = {2, 3, 5};
		
		for(int i = 0; i < arr.length - 1; i++) {
			if(arr[i] * arr[i + 1] * arr[i + 2] == 30) {
				return true;
			}
		}
		
		return false;
		
	}

}

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many words do you want to sort?");
		int numWords = input.nextInt();
		
		//probably make a counter for numWords to use a while loop
		//so just subtract one from the counter until we exit the loop
		
		String fruit = "banana";
		char letter = fruit.charAt(0);
		System.out.println(letter);
		
		String rev = reverse(fruit);
		
		for (int i = 0; i < fruit.length(); i++) {
			letter = fruit.charAt(i);
			System.out.print(letter);
		}
		
	}

	private static String reverse(String fruit) {
		// TODO Auto-generated method stub
		return null;
	}
}

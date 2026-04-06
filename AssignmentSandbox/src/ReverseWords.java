import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO take user inputs and sort them alphabetically
		Scanner input = new Scanner(System.in);
		System.out.println("How many words do you want to sort?");
		int numWords = input.nextInt();
		int count = numWords;
		
		for(int i = 0; i < count; i++) {
			System.out.print("Enter in your word: ");
			String[] words = new String[] {input.next()};

			System.out.println(words);
		}
		
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

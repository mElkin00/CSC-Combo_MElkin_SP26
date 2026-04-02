import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many words do you want to sort?");
		int numWords = input.nextInt();
		int count = numWords;
		String word = "hihihih";
		String[] words = new String[] {};
		
		
		//probably make a counter for numWords to use a while loop
		//so just subtract one from the counter until we exit the loop
		
		while(count != 0) {
			System.out.print("Enter in your word: ");
			word = input.next();
			
			
			
			
			System.out.println(count);
			System.out.println(words[0]);
			count--;
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

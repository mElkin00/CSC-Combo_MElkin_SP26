import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrangeWords {

	public static void main(String[] args) {
		//TODO take user inputs and sort them alphabetically
		Scanner input = new Scanner(System.in);
		System.out.println("How many words do you want to sort?");
		int numWords = input.nextInt();
		int count = numWords;
		System.out.println("Enter in your words");
		String temp = "";
		
		for(int i = 0; i < count; i++) {
			
			String[] words = new String[] {input.next()};
			
			for(int j = 0; j < count; j++) {
				for(int k = 0; k < count - j - 1; k++) {
					if(words[0].charAt(0) < words[1].charAt(0)) {
						temp = words[1];
						words[1] = words[0];
						words[0] = temp;
					}
				}
			}
			System.out.println(String.join(" ", words));
		}
		
	}
		
}


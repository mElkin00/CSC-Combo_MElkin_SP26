import java.util.Scanner;

public class dubloon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter in a word and I will tell you if it is a dubloon: ");
		String word = input.next();
		word = word.toLowerCase();
		
		if(isDoubloon(word))
		{
			System.out.println(word + " is a doubloon");
		}
		else {
			System.out.println(word + " is not a doubloon");
		}
		
	}
	
	private static boolean isDoubloon(String word) {
		int count = 0;
		for (int i = 0; i < word.length(); i++) {
			for (int j = 0; j < word.length(); j++) {
				if(word.charAt(i) == word.charAt(j)) {
					count ++;
				}
			}
			if(count > 2 || count < 2) {
				return false;
			}
			count = 0;
		}
		return true;
	}

}

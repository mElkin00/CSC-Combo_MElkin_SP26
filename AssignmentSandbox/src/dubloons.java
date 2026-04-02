
public class dubloons {
	String word = "word";
	
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

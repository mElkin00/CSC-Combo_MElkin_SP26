/************************
 * 						*
 * 	@author S02373613	*
 * 	2/24/2026			*
 * 						*
 ************************/
import java.util.Scanner;


public class Exercises {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word and I will tell you if it is abecedarian: ");
		String word = input.next();
		String lWord = word.toLowerCase();
		if(isAbcedarian(lWord))
		{
			System.out.println(word + " is abecedarian");
		}
		else {
			System.out.println(word + " is not abecedarian");
		}
		if(isDoubloon(lWord))
		{
			System.out.println(word + " is a doubloon");
		}
		else {
			System.out.println(word + " is not a doubloon");
		}
		System.out.println("What Scrabble letters do you have? ");
		String letters = input.next();
		if(canSpell(lWord)) {
			System.out.println("You can spell the word " + word);
		}
		
	}
	

	/****************************************************************
	 * 																*
	 *	 	In Scrabble1 each player has a set of tiles with		*
	 *	 	letters on them. The object of the game is to use		*
	 * 		those letters to spell words. The scoring system is		*
	 * 		complex, but longer words are usually worth more than	*
	 * 		shorter words. Imagine you are given your set of		*
	 * 		tiles as a string, like "quijibo", and you are given	*
	 * 		another string to test, like "jib". Write a method		*
	 * 		called canSpell that takes two strings and checks		*
	 * 		whether the set of tiles can spell the word. You		*
	 * 		might have more than one tile with the same letter,		*
	 * 		but you can use each tile only once.					*
	 *		 try using indexOf, charAt, & substring					*
	 *			boolean canSpell(String tiles, String word) 		*
	 *	    		for ( 0 -> word.length )						*
	 *	        	index <- tiles.indexOf(word.charAt)   			*
	 *	        	if ( index is not found)						*
	 *	            	return false								*
	 *	    		create new substring tiles without found char	*
	 *	    	return true											*
	 *																*
	 ****************************************************************/
	
	private static boolean canSpell(String lWord) {
		// TODO Auto-generated method stub
		return false;
	}
	
	/********************************************
	 * 											*
	 * 	A word is said to be a “doubloon” if	*
	 * 	every letter that appears in the word	*
	 * 	appears exactly twice. Write a method	*
	 * called isDoubloon that takes a string	*
	 * and checks whether it is a doubloon.		*
	 * To ignore case, invoke the toLowerCase	*
	 * method before checking. 					*
	 *											*
	 ********************************************/

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

	/********************************************************
	 * 														*
	 *	 A word is said to be “abecedarian” if the			*
	 *	 letters in the word appear in alphabetical order.	*
	 *	 Write a method called isAbecedarian that take		*
	 *	 a String and returns a boolean indicating whether	*
	 *	 the word is abecedarian.							*
	 *														* 
	 ********************************************************/
	private static boolean isAbcedarian(String word) {
		for (int i = 0; i < word.length()-1; i++) {
			if(word.charAt(i) > word.charAt(i + 1))
			{
				return false;
			}
		}
		return true;
	}

}


public class WarSand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deck deck = new Deck();
		deck.shuffle();
		deck.printDeck();
		System.out.println("*************************");
		Deck sorted = deck.mergeSort();
		sorted.printDeck();
	}

}

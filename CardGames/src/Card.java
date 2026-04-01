
public class Card {
	//final means that these instance variables immutable
	//private means that no one outside of this script can see it
	private final int suit;
	private final int rank;

	//static that everyone comes here to see what is in the array
	private static final String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
	//the null at oth position is so an ace is 1 , deuse is a 2...
	private static final String[] RANKS = { null, "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen",
			"King" };

	//constructor takes a rank and suit (ints) to create a card
	public Card(int rank, int suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	//we create an equals method to check both instance vars
	//we cant check a tuple we have to check each value
	public boolean equals(Card that) {
		return this.suit == that.suit && this.rank == that.rank;
	}
	
	public int compareTo(Card that) {
		if(this.suit < that.suit) return -1;
		if(this.suit > that.suit) return 1;
		if(this.rank < that.rank) return -1;
		if(this.rank > that.rank) return 1;
		return 0;
	}

	public int getSuit() {
		return suit;
	}



	public int getRank() {
		return rank;
	}



	public String toString() {
		return RANKS[this.rank] + " of " + SUITS[this.suit];
	}

}

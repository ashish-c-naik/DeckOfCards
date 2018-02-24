/**
 * @author  Ashish Chandrakant Naik
 * @version 1.0
 */

public class Card {
	
	private Deck.Suit mSuit;
    private Deck.Rank mRank;

    public Card(Deck.Suit suit, Deck.Rank rank) {
        this.mSuit = suit;
        this.mRank = rank;
    }

    public Deck.Suit getSuit() {
        return mSuit;
    }

    public Deck.Rank getRank() {
        return mRank;
    }

    public int getValue() {
        return mRank.ordinal() + 2;
    }

    @Override
    public boolean equals(Object o) {
        return (o != null && o instanceof Card && ((Card) o).mRank == mRank && ((Card) o).mSuit == mSuit);
    }
}

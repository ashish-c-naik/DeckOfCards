import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	private ArrayList<Card> mCards;
    private ArrayList<Card> mPulledCards;
    private Random mRandom;
    public static enum Suit {
	    SPADES,
	    HEARTS,
	    DIAMONDS,
	    CLUBS;
	}

    public static enum Rank {
	    TWO,
	    THREE,
	    FOUR,
	    FIVE,
	    SIX,
	    SEVEN,
	    EIGHT,
	    NINE,
	    TEN,
	    JACK,
	    QUEEN,
	    KING,
	    ACE;
	}
	public Deck() {
		mRandom = new Random();
	    mPulledCards = new ArrayList<Card>();
	    mCards = new ArrayList<Card>(Suit.values().length * Rank.values().length);
	    reset();
	}
	private void reset() {
		// TODO Auto-generated method stub
		mPulledCards.clear();
	    mCards.clear();
	    for (Suit s : Suit.values()) {
	        for (Rank r : Rank.values()) {
	            Card c = new Card(s, r);
	            mCards.add(c);
	        }
	    }
	}
	public Card dealOneCard() {
		if (mCards.isEmpty())
	        return null;

	    Card res = mCards.remove(randInt(0, mCards.size() - 1));
	    if (res != null)
	        mPulledCards.add(res);
	    System.out.println("\nOnly "+mCards.size()+" cards left in deck! \n");
	    return res;
	}
	public void shuffle() {
		System.out.println("Cards before shuffling:\n --------------------\n");
		for(Card card:mCards) {
			System.out.print("||"+card.getRank()+" "+card.getSuit());
		}
		Collections.shuffle(mCards);
		System.out.println("\nCards after shuffling:\n --------------------\n");
		for(Card card:mCards) {
			System.out.print("||"+card.getRank()+" "+card.getSuit());
		}
		
	    return;
	}
	public int randInt(int min, int max) {
	    int randomNum = mRandom.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	public boolean isEmpty(){
	    return mCards.isEmpty();
	}
	
}


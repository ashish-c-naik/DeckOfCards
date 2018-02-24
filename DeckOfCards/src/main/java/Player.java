/**
 * @author  Ashish Chandrakant Naik
 * @version 1.0
 */
public class Player {
	String name;
	int id;
	static int count = 0;
	int[] deck = new int[52];
	Deck d = new Deck();
	Card c;
	Player(String name){
		this.name = name;
		this.id = count++;
	}
	void dealOneCard() {
	c = d.dealOneCard();
	if (c!=null) {
	System.out.println(c.getRank());
	System.out.println(c.getSuit());
	}
	else System.out.println("Empty deck.");
	}
	void shuffle() {
	d.shuffle();
	System.out.println("Done");
	}
	
}

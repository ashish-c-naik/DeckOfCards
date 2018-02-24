import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner m = new Scanner(System.in);
		System.out.println("Enter name of player");
		String name = m.nextLine();
		Player player = new Player(name);
		System.out.println("\nWelcome \n"+name);
		System.out.println("\n-----------------");
		System.out.println("\nYou have 52 cards with you!");
		System.out.println("\n-----------------\n");
		System.out.println("\n1- Deal one card");
		System.out.println("\n2- Shuffle");
		System.out.println("\n3- Player name");
		System.out.println("\n0- Exit");
		System.out.println("\n-----------------\n");
		int move = m.nextInt();
		while(move != 0) {
			
			if(move == 1)
				player.dealOneCard();
			if(move == 2)
				player.shuffle();
			if(move == 3)
				System.out.println("\nPlayer's name is "+player.name);
			System.out.println("\n-----------------\n");
			System.out.println("\n1- Deal one card");
			System.out.println("\n2- Shuffle");
			System.out.println("\n3- Player name");
			System.out.println("\n0- Exit");
			System.out.println("\n-----------------\n");
			move = m.nextInt();
		}
		
		
	}
}

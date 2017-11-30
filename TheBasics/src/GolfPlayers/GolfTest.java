package GolfPlayers;

public class GolfTest {

	public static void main(String[] args) {

		Player p1 = new Player("Bob","USA",16,67,4,1.3);
		Player p2 = new Player("Bob2","Uganda",4,67,1,9.3);
		Player p3 = new Player("Bob3","England",9,67,2,6.3);

		EuropeTour EU = new EuropeTour(p1,p2,p3);
		EU.Display(p1,p2,p3);
	}
}

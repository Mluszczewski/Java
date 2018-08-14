package bottlesOfBeer;

public class Bottles {

	public static void main(String[] args) {
		int IloscButelek = 99;
		String slowo = "Bottles";
		
		while (IloscButelek > 0) {
			if (IloscButelek > 1) {
				slowo = "Bottle";
			}
			
			System.out.println(IloscButelek + " " + slowo + " of beer on the wall");
			System.out.println(IloscButelek + " " + slowo + " of beer");
			System.out.println("One take down");
			System.out.println("Pass it around");
			System.out.println("-----------------------------------------------------");
			IloscButelek = IloscButelek - 1;
			
			if (IloscButelek == 0) {
				System.out.println("No more bottles of beer left on the wall!");
			}
			
		}
			
	}
}

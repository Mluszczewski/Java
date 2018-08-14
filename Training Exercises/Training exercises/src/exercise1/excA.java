package exercise1;

public class excA {

	public static void main(String[] args) {
		excCd[] obty = new excCd[6];
		int y = 1;
		int x = 0;
		int wynik = 0;
		while (x < 6) {
			obty[x] = new excCd();
			obty[x].izm = y;
			y = y * 10;
			x = x + 1;
		}
		
		x = 6;
		while (x > 0) {
			x = x - 1;
			wynik = wynik + obty[x].zrobCos(x);
		}
		System.out.println("Wynik " + wynik);
	}

}

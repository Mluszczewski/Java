package excWithADog;

public class Doge {

	private int wielkosc;
	public int getWielkosc() {
		return wielkosc;
	}
	
	public void setWielkosc(int w) {
		wielkosc = w;
	}
	
	void szczekaj() {
		if (wielkosc > 22) {
			System.out.println("Duzy pies");
		}
		else if (wielkosc > 6) {
			System.out.println("Sredni pies");
		}
		else {
			System.out.println("Maly pies");
		}
	}
}

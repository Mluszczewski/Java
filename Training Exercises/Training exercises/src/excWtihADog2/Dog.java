package excWtihADog2;

public class Dog {

	int wielkosc;
	String imie;
	
	void szczekaj() {
		if (wielkosc > 20) {
			System.out.println("Jest duzy");
		} else if (wielkosc > 6){
			System.out.println("Jest Maly");
		} else {
			System.out.println("Jest bardzo maly");
		}
	}
	void szczekaj (int IloscSzczekniec) {
		while (IloscSzczekniec > 0) {
			System.out.print("Wof ");
			IloscSzczekniec = IloscSzczekniec - 1;
		}
	}
}


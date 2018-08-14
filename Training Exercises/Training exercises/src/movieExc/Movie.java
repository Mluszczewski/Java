package movieExc;

public class Movie {

	String tytul;
	String rodzaj;
	int ocena;
	
	void odtworz() {
		System.out.println("Leci film ");
		System.out.println("Tytul filmu: " + tytul);
		System.out.println("Rodzaj filmu: " + rodzaj);
		if (ocena > 5) {
			System.out.println("Polecany jest przez wiele osob jego ocena to: " + ocena);
		}
		else {
			System.out.println("Film jest slaby a jego ocena to: " + ocena);
		}
		System.out.println("--------------------");
	}
}


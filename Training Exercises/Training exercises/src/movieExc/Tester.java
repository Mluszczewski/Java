package movieExc;

public class Tester {

	public static void main(String[] args) {
		Movie pierwsze = new Movie();
		pierwsze.tytul = "wolo";
		pierwsze.rodzaj = "dramat";
		pierwsze.ocena = -2;
		pierwsze.odtworz();
		
		Movie drugi = new Movie();
		drugi.tytul = "lolo";
		drugi.rodzaj = "komedia";
		drugi.ocena = 10;
		drugi.odtworz();
		
		Movie trzeci = new Movie();
		trzeci.tytul = "trolo";
		trzeci.rodzaj = "horror";
		trzeci.ocena = 4;
		trzeci.odtworz();
	}

}


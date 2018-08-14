package aGameOfShips;
import java.util.*;

public class StatkiGraMax {

	private PomocnikGry pomocnik = new PomocnikGry();
	private ArrayList<Statki> listaStatkow = new ArrayList<Statki>();
	private int iloscRuchow = 0;
	
	private void przygotujGre() {
		Statki pierwszy = new Statki();
		pierwszy.setNazwa("Lotniskowiec");
		
		Statki drugi = new Statki();
		drugi.setNazwa("Krazownik");
		
		Statki trzeci = new Statki();
		trzeci.setNazwa("Niszczyciel");
		
		listaStatkow.add(pierwszy);
		listaStatkow.add(drugi);
		listaStatkow.add(trzeci);
		
		System.out.println("Musisz zatopic trzy statki");
		System.out.println("Lotniskowiec, Krazownik, Niszczyciel");
		System.out.println("Zatop je w jak najmniejszej ilosci ruchow");
	
		for (Statki rozmieszczanyStatek : listaStatkow) {
			ArrayList<String> nowePolozenie = pomocnik.rozmiescStatek(3);
			rozmieszczanyStatek.setPolaPolozenia(nowePolozenie);
	}
}


private void rozpocznijGre(){
	while (!listaStatkow.isEmpty()) {
		String ruchGracza = pomocnik.pobierzDaneWejsciowe("Podaj pole: ");
		sprawdzRuchGracza(ruchGracza);
	}
	zakonczGre();
}

private void sprawdzRuchGracza(String ruch) {
	
	iloscRuchow ++;
	String wynik = "pudlo";
	
	for (Statki statekDoSprawdzenia : listaStatkow) {
		wynik = statekDoSprawdzenia.sprawdz(ruch);
		if (wynik.equals("trafiony")) {
			break;
		}
		if (wynik.equals("zatopiony")) {
			listaStatkow.remove(statekDoSprawdzenia);
			break;
		}
	}
	System.out.println(wynik);
}

private void zakonczGre() {
	System.out.println("Zatopiles wszystkie statki");
	if (iloscRuchow <= 18) {
		System.out.println("Wykonales tylko " + iloscRuchow + " ruchow");
		System.out.println("Prawdziwy pirat z ciebie");
	} else {
		System.out.println("Wykonales " + iloscRuchow + " ruchow");
		System.out.println("Nie jestes prawdziwym piratem");
	}
}

public static void main (String[] args) {
	StatkiGraMax gra = new StatkiGraMax();
	gra.przygotujGre();
	gra.rozpocznijGre();
	}
}

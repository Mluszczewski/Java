package aGameOfShips;
import java.util.*;

public class Statki {

	private ArrayList<String> polaPolozenia;
	private String nazwa;
	
	public void setPolaPolozenia(ArrayList<String> ppol) {
		polaPolozenia = ppol;
	}
	
	public void setNazwa(String nzwStatku) {
		nazwa = nzwStatku;
	}
	
	public String sprawdz(String ruch) {
		String wynik = "pudlo";
		int indeks = polaPolozenia.indexOf(ruch);
		if (indeks >= 0) {
			polaPolozenia.remove(indeks);
			
			if (polaPolozenia.isEmpty()) {
				wynik = "zatopiony";
				System.out.println("Trafiony zatopiony " + nazwa);
			}else {
				wynik = "trafiony";
			}	
		}
		return wynik;
	}
}

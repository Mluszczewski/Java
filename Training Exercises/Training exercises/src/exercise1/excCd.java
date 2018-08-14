package exercise1;

public class excCd {
	int izm;
	public int zrobCos(int czynnik) {
		if (izm > 100) {
			return izm * czynnik;
		}
		else {
			return izm * (5 - czynnik);
		}
	}
}


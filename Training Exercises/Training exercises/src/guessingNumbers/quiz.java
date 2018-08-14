package guessingNumbers;

public class quiz {

	Player p1;
	Player p2;
	Player p3;
	
	public void rozpocznijGre() {
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		
		int typ1 = 0;
		int typ2 = 0;
		int typ3 = 0;
		
		boolean p1odgadl = false;
		boolean p2odgadl = false;
		boolean p3odgadl = false;
		
		int liczbaOdgadywana = (int) (Math.random() * 10);
		System.out.println("Komputer wylosowal liczbe z zakresu od 0 do 9");
		
		while (true) {
			
			System.out.println("Nalezy wytypowac liczbe: " + liczbaOdgadywana);
			
			p1.zgaduj();
			p2.zgaduj();
			p3.zgaduj();
			
			typ1 = p1.liczba;
			System.out.println("Gracz pierwszy wytypowal liczbe: " + typ1);
			typ2 = p2.liczba;
			System.out.println("Gracz drugi wytypowal liczbe: " + typ2);
			typ3 = p3.liczba;
			System.out.println("Gracz trzeci wytypowal liczbe: " + typ3);
			
			if (typ1 == liczbaOdgadywana) {
				p1odgadl = true;
			}
			
			if (typ2 == liczbaOdgadywana) {
				p2odgadl = true;
			}
			
			if (typ3 == liczbaOdgadywana) {
				p3odgadl = true;
			}
			
			if (p1odgadl || p2odgadl || p3odgadl) {
				System.out.println("Mamy zwyciezce");
				System.out.println("Czy gracz pierwszy wytypowal prawidlowo? - " + p1odgadl);
				System.out.println("Czy gracz drugi wytypowal prawidlowo? - " + p2odgadl);
				System.out.println("Czy gracz trzeci wytypowal prawidlowo? - " + p3odgadl);
				System.out.println("Koniec gry");
				break;
				
			} else {
				System.out.println("Nikt nie odgadl, sprobujcie ponownie");
				System.out.println("------------------------------------------");
			}
		}
	}
}

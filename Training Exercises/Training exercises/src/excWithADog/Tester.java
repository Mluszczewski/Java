package excWithADog;

public class Tester {

	public static void main(String[] args) {

		Doge pierwszy = new Doge();
		pierwszy.setWielkosc(70);
		
		Doge drugi = new Doge();
		drugi.setWielkosc(8);
		
		System.out.println("Pierwszy pies ma : " + pierwszy.getWielkosc());
		System.out.println("Drugi pies: " + drugi.getWielkosc());
		pierwszy.szczekaj();
		drugi.szczekaj();
	}

}

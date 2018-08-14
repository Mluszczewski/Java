
public class Tablice1 {

	public static void main(String[] args) {
		int[] tablica = new int[10];
		
		for (int i=0; i<10; i++) 
			tablica[i] = 1+i;
			
		int zmienna = tablica[3];
		for (int i=0; i<10; i++)
			System.out.println("kolejna komórka to: "+tablica[i]);

	}

}

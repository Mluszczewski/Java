package islandExc;

public class Island {

	public static void main(String[] args) {
		
	String[] wyspy = new String[4];
	int[] indeks = new int[4];
	int y = 0;
	
	wyspy[0] = "Bermudy";
	wyspy[1] = "Fiji";
	wyspy[2] = "Azory";
	wyspy[3] = "Kozumel";
	
	indeks[0] = 1;
	indeks[1] = 3;
	indeks[2] = 0;
	indeks[3] = 2;
	
	int ref;
	while (y < 4) {
		ref = indeks[y];
		System.out.print("wyspa = ");
		System.out.println(wyspy[ref]);
		y = y + 1;
		
		}
	}
}

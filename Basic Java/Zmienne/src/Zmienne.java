
public class Zmienne {

	public static void main(String[] args) {
		int a=5;
		int b=20;
		int wynik = a+b;
		System.out.println("a+b = "+(a+b));
		System.out.println(wynik);

		String x = "hey ";
		String y = "whats ";
		String z = "up";
		String c = x + y + z;
		System.out.println(c);
		
		String wake = c.substring(0, 4)+"wake"+c.substring(9,12);
		System.out.println(wake);
		
		short e = 5;
		final int f = 129;
		final char g = 'g';
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
	}

}

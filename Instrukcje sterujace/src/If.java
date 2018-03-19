import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		double x;
		Scanner odczyt = new Scanner(System.in);
		System.out.println("Podaj liczbê: ");
		x = odczyt.nextDouble();
		
		if(x%2 == 0)
			System.out.println("Liczba parzysta");
		else
			System.out.println("Liczba nieparzysta");
		if(x>10)
			System.out.println("Liczba wiêksza od 10");
		else if(x>0 && x<=10)
			System.out.println("Liczba dodatnia mniejsza, lub równa 10");
		else
			System.out.println("Liczba ujemna");
	}

}

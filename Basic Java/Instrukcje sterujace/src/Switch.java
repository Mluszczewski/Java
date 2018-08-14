import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int x;
		Scanner y = new Scanner(System.in);
		System.out.print("Podaj liczbê: ");
		x = y.nextInt();
		
		switch(x) {
		case 1:
			System.out.println("Liczba to 1");
			break;
		case 2:
			System.out.println("Liczba to 2");
			break;
		default:
			System.out.println("Ta liczba to nie 1 ani 2");
			
		}

	}

}

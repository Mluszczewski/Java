import java.util.Scanner;

public class Witaj {

	public static void main(String[] args) {
		String imie;
		Scanner odczyt = new Scanner(System.in);
		System.out.print("Podaj swoje imiê: ");
		
		imie = odczyt.nextLine();
		System.out.println("Witaj "+imie);

	}

}

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;

public class Zadanie {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.print("Podaj swoje imie: ");
			String imie = input.nextLine();
			

		PrintWriter zapis = new PrintWriter("imie.txt");
		zapis.print(imie);
		zapis.close();
		
		Scanner odczyt = new Scanner(new File("imie.txt"));
		System.out.println(odczyt.nextLine());
		

	}

}

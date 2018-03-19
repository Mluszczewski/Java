import java.util.Scanner;
import java.lang.String;

public class Zadanie1 {

	public static void main(String[] args) {
		String[] tab = new String[6];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Give me 5 names");
		
		for(int i=1; i<6; i++) {
			System.out.print("Name number "+i+":");
			tab[i] = scan.nextLine();
		}
		for(int i=1; i<6; i++)
			System.out.println("Good morning: "+tab[i]);
			
					
	}

}

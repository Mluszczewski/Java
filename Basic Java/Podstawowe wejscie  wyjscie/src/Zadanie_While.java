import java.util.Scanner;

public class Zadanie_While {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Za ile bomba ma wybuchn¹æ: ");
		int x = scan.nextInt();
		
		while(x>0) {
			System.out.println("Bomba wybuchnie za: "+x+"!");
			x--;
		}
		System.out.println("Bomba wybuch³a!");
	}

}

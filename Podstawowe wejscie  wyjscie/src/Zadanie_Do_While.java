import java.util.Scanner;

public class Zadanie_Do_While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Set the bomb timer: ");
		int x = scan.nextInt();
		
		do {
			System.out.println("Bomb will detonate in: "+x+"!");
			x--;
		}
			while(x>0);
		System.out.println("Bomb detonaded!");
	}
	
}

import java.util.Scanner;


public class Zadanie{


	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Podaj za ile ma wybuchn¹æ bomba: ");
		int x = scan.nextInt();
		
		for(int i=x; i>0; i--) {
			System.out.println("Wybuch bomby za: "+i+"!");
		}
		
		System.out.println("Bomba wybuch³a!");
		
	}

}

import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		int[] tab;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Podaj iloœæ elementów tablicy: ");
		int x = scan.nextInt();
		tab = new int[x];
		
		for (int i=0; i<tab.length; i++) {
			tab[i] = i+1;
			
		}
		
		int y = 0;
		while(y<tab.length) {
			System.out.println(tab[y]+" ");
			y++;
		}
		 
		

	}

}

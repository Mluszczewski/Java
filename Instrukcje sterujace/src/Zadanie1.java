import java.util.Scanner;

public class Zadanie1 {

	public static void main(String[] args) {
		int a,b;
		Scanner x = new Scanner(System.in);
		
		System.out.print("Podaj pierwsz� liczb�: ");
		a = x.nextInt();
		
		System.out.print("Podaj drug� liczb�: ");
		b = x.nextInt();
		
		if(a==b)
			System.out.println("Liczby s� r�wne");
		else if(a>b)
			System.out.println("Liczba "+a+"jest wi�ksza od libzy "+b);
		else
			System.out.println("Liczba "+a+" jest mniejsza od liczby "+b);

	}

}

import java.util.Scanner;

public class Zadanie2 {

	public static void main(String[] args) {
		
		Scanner x = new Scanner(System.in);
		
		System.out.print("Podaj swoje imi�: ");
		String a = x.nextLine();
		
			if ("Mateusz".equals(a))
				System.out.println("Witaj "+a);
			else if ("Darek".equals(a))
				System.out.println("Cze�� "+a);
			else if ("Szymon".equals(a))
				System.out.println("Good morning "+a);
			else
				System.out.println("Przykro mi ale ci� nie znam");
		

	}

}

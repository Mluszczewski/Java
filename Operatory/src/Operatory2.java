
public class Operatory2 {

	public static void main(String[] args) {
		double a = 5.0;
		double b = 20.0;
		double c = 5.0;
		String x = "10";
		String y = "10";
		
		double a1 = a+b+c;
		double a2 = (a+b)/c;
		double a3 = (a-b)*c;
		boolean prawda = a<b;
		boolean fa³sz = a>b;
		boolean porównanie = a==c;
		boolean porównanie1 = a==b;
		boolean porównanie2 = x.equals(y);
		boolean koniunkcja = (a>b)&&(a!=b);
		boolean alternatywa = (a>b)||(a!=b);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(prawda);
		System.out.println(fa³sz);
		System.out.println(porównanie);
		System.out.println(porównanie1);
		System.out.println(porównanie2);
		System.out.println(koniunkcja);
		System.out.println(alternatywa);
		System.out.println("(a+b)*c = "+(a+b)*c);
		System.out.println("a-b/c = "+(a-c)/c);
		
		a++;
		b++;
		c++;
		System.out.println("Czy a+b>c?"+((a+b)>c));
		System.out.println("czy a=b?"+(a==b));
		System.out.println("czy x=y?"+(x.equals(y)));
		System.out.println(a++);
		System.out.println(b++);
		
		
		

	}

}

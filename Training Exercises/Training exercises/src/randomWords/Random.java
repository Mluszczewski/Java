package randomWords;

public class Random {

	public static void main(String[] args) {
		String[] listaSlow1 = {"glowa", "poduszka", "lozko", "loza"};
		String[] listaSlow2 = {"w", "lezy", "chetnie", "nalezy do"};
		String[] listaSlow3 = {"betoniarce", "na dywanie", "czeka", "VIP"};
		
		int lista1Dlugosc = listaSlow1.length;
		int lista2Dlugosc = listaSlow2.length;
		int lista3Dlugosc = listaSlow3.length;
		
		int rnd1 = (int) (Math.random() * lista1Dlugosc);
		int rnd2 = (int) (Math.random() * lista2Dlugosc);
		int rnd3 = (int) (Math.random() * lista3Dlugosc);
		
		String zdanie = listaSlow1[rnd1] + " " + listaSlow2[rnd2] + " " + listaSlow3[rnd3];
		
		System.out.println("Oto losowe zdanie: " + zdanie);
		System.out.println("Dl listy 1 = " + lista1Dlugosc + " Dl 2 = " + lista2Dlugosc + " Dl 3 = " + lista3Dlugosc);

	}

}



public class Strings {

	public static void main(String[] args) {
		String hello = "Witaj ";
		String world = "�wiecie!";
		String powitanie = hello+world;
		System.out.println(powitanie);
		
		String czesc = powitanie.substring(0, 6)+"uczniu";
		System.out.println(czesc);

	}

}

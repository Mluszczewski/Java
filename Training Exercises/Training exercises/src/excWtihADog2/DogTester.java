package excWtihADog2;

public class DogTester {

	public static void main(String[] args) {
		Dog pierwszy = new Dog();
		pierwszy.wielkosc = 40;
		
		Dog drugi = new Dog();
		drugi.wielkosc = 2;
		
		Dog trzeci = new Dog();
		trzeci.wielkosc = 8;
		
		pierwszy.szczekaj(3);
		drugi.szczekaj();
		trzeci.szczekaj();

	}

}


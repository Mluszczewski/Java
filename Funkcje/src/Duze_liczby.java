import java.math.BigInteger;

public class Du¿e_liczby {

	public static void main(String[] args) {
		BigInteger x = new BigInteger("90000000000000000000");
		BigInteger y = new BigInteger("30000000000000000000");
		System.out.println("suma liczby "+x+" oraz "+y+" to: "+x.add(y).toString());
		System.out.println("ró¿nica liczby "+x+" oraz "+y+" to: "+x.subtract(y).toString());
		System.out.println("Iloczyn liczby "+x+" oraz "+y+" to: "+x.multiply(y).toString());
		System.out.println("Iloraz liczby "+x+" oraz "+y+" to: "+x.divide(y).toString());

	}

}

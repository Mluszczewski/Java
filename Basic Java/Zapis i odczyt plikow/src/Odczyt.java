import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Odczyt{
  public static void main(String[] args) throws FileNotFoundException{
      File file = new File("ala.txt");
      Scanner in = new Scanner(file);
 
      String zdanie = in.nextLine();
      System.out.println(zdanie);
  }
}

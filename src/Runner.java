
import java.util.Scanner;

public class Runner {

  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    String input = kbd.nextLine();
    while (!input.equals("quit")) {
      
      input = kbd.nextLine();
    }
  }

}

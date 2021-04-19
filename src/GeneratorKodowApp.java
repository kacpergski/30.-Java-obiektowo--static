
import java.util.Scanner;

public class GeneratorKodowApp {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "UTF-8");
        while (true) {
            System.out.println("Generowac kod? wcisnij 1: ");
            int size = scanner.nextInt();

            String text = Generator2.text(size);
            System.out.println(text);
        }

    }
}1
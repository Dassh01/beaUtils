import java.util.Scanner;

public class Main extends beaUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Test of beaUtils askForThing
        System.out.println(askForThing(("Echo: "),Scanner::nextLine,scanner)); //PASS as of 11/16/24
    }
}
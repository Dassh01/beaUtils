import java.util.HashSet;
import java.util.Scanner;

public class Main extends beaUtils {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Test of beaUtils askForThing
        //PASS as of 11/16/24
        //System.out.println(askForThing(("Echo: "),Scanner::nextLine,scanner));

        //Test of version A of method userInputBoolean
        //PASS as of 11/18/24
        //System.out.println(userInputBoolean(askForThing("(Yes/No): ",Scanner::nextLine,scanner))); //If input yes of any kind should return true, if no then should return false

        //Test of version B of method userInputBoolean
        //PASS as of 11/18/24
        HashSet<String> trueValues = new HashSet<>();
        trueValues.add("y");
        trueValues.add("yes");
        trueValues.add("true");
        trueValues.add("t");
        System.out.println(userInputBoolean(askForThing("(Yes/No): ",Scanner::nextLine,scanner),trueValues));
    }
}
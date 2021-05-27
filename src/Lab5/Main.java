package Lab5;
import Lab5.MovieStuff.*;
import Lab5.Commands.*;
import Lab5.Util.Decoder;
import Lab5.Util.FileReader;

import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws FileNotFoundException the file not found exception
     */
    public static void main (String[] args) throws FileNotFoundException {
        MovieCollection movieCollection = new MovieCollection();
        Decoder.fillCollection(FileReader.readFromFile(FileReader.getFilePath()));
        Commands commands = new Commands();
        commands.regist(new Show(), new Exit(),  new Insert(), new Save(), new NameFilter(), new MaxOscar(), new ExecuteScript(), new Clear(), new Update(), new RemoveKey());
        Scanner in = new Scanner(System.in);
        System.out.println("Ave, Caesar, morituri te salutant,введите команду,для справки введите help.");
        while (true) {
            System.out.print("~ ");
            String commandName = in.nextLine();
            if (!commandName.equals(""))
                System.out.println( commands.executeCommand(commandName));
            System.out.println("Введите команду:");

        }

    }
}

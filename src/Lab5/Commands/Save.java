package Lab5.Commands;

import Lab5.MovieStuff.MovieCollection;
import Lab5.Util.FileWriter;

import java.io.IOException;
import java.util.Scanner;

/**
 * The type Save.
 */
public class Save implements CommandWithoutArg {

    @Override
    public String execute(Object o) throws IOException {
        FileWriter.writeLabToFile(MovieCollection.getCollection());
        return ("");
    }

    @Override
    public String getName() {
        return "save";
    }
}
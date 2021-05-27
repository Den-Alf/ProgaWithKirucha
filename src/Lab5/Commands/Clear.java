package Lab5.Commands;

import Lab5.MovieStuff.MovieCollection;

/**
 * The type Clear.
 */
public class Clear implements CommandWithoutArg {


    @Override
    public String execute(Object o) {
        MovieCollection collection = new MovieCollection();
        if (collection.getSize()==0) return "Коллекция и так пустая.";
        collection.clear();
        return ("Коллекция успешно очищена.");
    }

    @Override
    public String getName() {
        return "clear";
    }
}
package Lab5.Commands;
import Lab5.MovieStuff.Movie;
import Lab5.MovieStuff.MovieCollection;
import Lab5.Util.MovieCreater;

import java.util.Hashtable;
import java.util.Map;

/**
 * The type Add.
 */
public class Insert implements Commandable {


    @Override
    public String execute(Object o) {
        MovieCollection collection = new MovieCollection();
        if (collection.containsKey(Integer.parseInt((String)o))){
            return ("Такой ключ уже есть в мапе");
        }
        else {
            collection.add(new MovieCreater().create("free"), Integer.parseInt((String) o));
            return ("Транспорт успешно добавлен.");
        }
    }

    @Override
    public String getName() {
        return "insert";
    }
}

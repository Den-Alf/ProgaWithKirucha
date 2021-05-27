package Lab5.Commands;

import Lab5.MovieStuff.Movie;
import Lab5.MovieStuff.MovieCollection;


import java.util.Iterator;
import java.util.Map;

/**
 * The type Remove.
 */
public class RemoveKey implements Commandable {

    @Override
    public String execute(Object arg) {
        try {
            MovieCollection collection = new MovieCollection();
            if (collection.getSize() == 0) return ("Коллекция пустая.");
            else {
                Integer key=Integer.parseInt((String)arg);
                if (!collection.containsKey(key)) {
                    return ("Эллемент с данным ключом не найден");
                }
                else {
                    collection.removeKebab(key);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Фильм удалён из коллекции";
    }

    @Override
    public String getName() {
        return "remove_key";
    }
}

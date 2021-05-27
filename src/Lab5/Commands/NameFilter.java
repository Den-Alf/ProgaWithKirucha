package Lab5.Commands;


import Lab5.MovieStuff.Movie;
import Lab5.MovieStuff.MovieCollection;

import java.util.Map;

/**
 * The type Filter fuel type.
 */
public class NameFilter implements Commandable {
    @Override
    public String execute(Object o) {
        String subSt = ((String) o).toUpperCase();
        String result = "---------------------------\n";
        boolean was = false;
        MovieCollection collection = new MovieCollection();
        if (collection.getSize() == 0) return ("Коллекция пустая.");

        else for (Map.Entry<Integer,Movie> entry :  collection.entrySet()) {
            Movie movie = entry.getValue();
            if (movie.getName().contains(subSt)) {
                was = true;
                result += (movie.getInfo() + "\n---------------------------\n");
            }
        }

        if (!was) return ("Нет таких элементов в коллекции");
        else  return result;
    }


    @Override
    public String getName() {
        return "filter_contains_name";
    }
}

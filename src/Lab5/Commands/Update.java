package Lab5.Commands;

import Lab5.MovieStuff.Movie;
import Lab5.MovieStuff.MovieCollection;
import Lab5.Util.*;
import java.util.Collection;
import java.util.Map;

/**
 * The type Update.
 */
public class Update implements Commandable {

    @Override
    public String execute(Object arg) {
        MovieCollection collection = new MovieCollection();
        try {
            int key = 0;
            if (collection.isIndexBusy(Integer.parseInt((String) arg))) {
                int id=Integer.parseInt((String) arg);
                for (Map.Entry<Integer,Movie> entry :  collection.entrySet()) {
                    Movie movie = entry.getValue();
                    if (movie.getId()==id){
                        key = entry.getKey();
                        MovieCollection.getCollection().remove(key);
                        break;
                    }
                }

               // Movie movieToDelete = MovieCollection.getCollection().filter(x->x.getId()==id).findFirst().get();
                collection.add((new MovieCreater()).create( (String) arg), key);
               // MovieCollection.getCollection().remove(movieToDelete);
                return ("Фильм [id:" + arg + "] успешно обновлен.");
            } else return ("Элемента с таким id не существует.");
        } catch (Exception e) {
            return ("Элемента с таким id не существует.");
        }
    }

    @Override
    public String getName() {
        return "update";
    }
}
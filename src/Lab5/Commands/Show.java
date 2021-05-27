package Lab5.Commands;

import Lab5.MovieStuff.*;

import java.util.Map;

/**
 * The type Show.
 */
public class Show implements CommandWithoutArg {
    @Override
    public String execute(Object o) {
        MovieCollection collection = new MovieCollection();
        if (collection.getSize() == 0) return ("Коллекция пустая.");
        else {
            String result="---------------------------\n";
            for (Map.Entry<Integer,Movie> entry :  collection.entrySet()){
                Movie movie = entry.getValue();
                result+=("Ключ элемента:"+entry.getKey()+"  "+movie.getInfo())+"\n---------------------------\n";
            }
            return result;
        }
    }

    @Override
    public String getName() {
        return "show";
    }
}


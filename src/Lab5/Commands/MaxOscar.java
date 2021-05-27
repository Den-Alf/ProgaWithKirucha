package Lab5.Commands;

import Lab5.MovieStuff.*;

import java.io.IOException;
import java.util.Map;

public class MaxOscar implements Commandable {


    @Override
    public String execute(Object o) throws IOException {
        MovieCollection collection = new MovieCollection();
        if (collection.getSize()==0) return "Коллекция и так пустая.";
        else{
            String result ="";
            int i = 0;
            long comparer = 0;
            for (Map.Entry<Integer,Movie> entry :  collection.entrySet()){
                Movie movie = entry.getValue();
                if(comparer<movie.getOscarsCount()){
                    comparer=movie.getOscarsCount();
                    result =(movie.getInfo());
                }
                i++;
            }
            return result;
        }
    }

    @Override
    public String getName() {
        return "max_by_oscars_count";
    }
}

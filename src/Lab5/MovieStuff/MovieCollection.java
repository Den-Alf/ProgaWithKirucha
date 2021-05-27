package Lab5.MovieStuff;

import java.time.LocalDate;
import java.util.Hashtable;
import java.util.Map;
import java.util.TreeMap;


/**
 * The type Movie collection.
 */
public class MovieCollection {
    private static TreeMap<Integer,Movie> collection = new TreeMap<Integer,Movie>();
    private static LocalDate creationDate;

    /**
     * Instantiates a new Movie collection.
     */
    public MovieCollection() {
        creationDate = LocalDate.now();
    }

    /**
     * Gets collection.
     *
     * @return the collection
     */
    public static TreeMap<Integer,Movie> getCollection() {
        return collection;
    }

    /**
     * Sets collection.
     *
     * @param collection the collection
     */
    public static void setCollection(TreeMap<Integer,Movie> collection) {
        MovieCollection.collection = collection;
    }

    /**
     * Gets creation date.
     *
     * @return the creation date
     */
    public static LocalDate getCreationDate() {
        return creationDate;
    }

    /**
     * Sets creation date.
     *
     * @param creationDate the creation date
     */
    public static void setCreationDate(LocalDate creationDate) {
        MovieCollection.creationDate = creationDate;
    }

    /**
     * Clear.
     */
    public void clear(){ collection.clear(); }

    /**
     * Get free id long.
     *
     * @return the long
     */
    public static long getFreeId(){
        long size = collection.size();
        Hashtable<Integer, String > busyIds= new Hashtable<Integer, String>();
        for (Map.Entry<Integer,Movie> entry :  collection.entrySet()){
            Movie movie = entry.getValue();
            busyIds.put(movie.getId(), "id");
        }
        int id = 1;
        while (true){
            if (busyIds.get(id) == null) {
                return id;
            }
            else id ++;
        }
    }

    /**
     * Get size int.
     *
     * @return the int
     */
    public int getSize(){
        return collection.size();
    }


    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo() {
        return "Тип коллекции: TreeMap\nРазмер коллекции: " + this.getSize() + "\nВремя последней инициализации: " + creationDate;
    }

    /**
     * Is index busy boolean.
     *
     * @param id the id
     * @return the boolean
     */
    public boolean isIndexBusy(int id){
        for (Map.Entry<Integer,Movie> entry :  collection.entrySet()){
            Movie movie = entry.getValue();
            if (movie.getId() == id) return true;
        }

        return false;
    }

    /**
     * Add.
     *
     * @param movie the movie
     */
    public void add(Movie movie,Integer key) {
        collection.put(key,movie);
    }

    public java.util.Set<Map.Entry<Integer, Movie>> entrySet(){
        return collection.entrySet();
    }

    public boolean containsKey(Integer key){
        return collection.containsKey(key);
    }


    public void removeKebab(Integer key){
        collection.remove(key);
    }

}

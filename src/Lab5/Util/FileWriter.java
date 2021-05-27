package Lab5.Util;


import Lab5.MovieStuff.Movie;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;


/**
 * The type File writer.
 */
public class FileWriter {
    /**
     * The Filename.
     */
    static String filename;

    /**
     * Sets filename.
     */
    public static void setFilename(String filename) {
        FileWriter.filename = filename;
    }


    /**
     * Write collection to file
     *
     * @param movies the movies
     */
    public static void writeLabToFile(TreeMap<Integer, Movie> movies) {
        try{

            FileOutputStream out = new FileOutputStream(filename);
            BufferedOutputStream bos = new BufferedOutputStream(out);
            System.out.println("Сработала запись");
            for (Map.Entry<Integer,Movie> entry :  movies.entrySet()) {
                System.out.println("Вход в цикл записи");
                Movie movie = entry.getValue();
                byte[] buffer = (movie.toString()+"\n").getBytes();
                bos.write(buffer,0,buffer.length);
            }
            bos.flush();
            out.close();
            System.out.println("Коллекция записана в файл.");
        // перевод строки в байты
         //   byte[] buffer = text.getBytes();
           // bos.write(buffer, 0, buffer.length);
    }
        catch(IOException ex){
            System.out.println(ex.getMessage());
    }
}


/*    public static void writeLabToFile(Vector<Vehicle> vehicles) throws FileNotFoundException {
        Gson gson = new Gson();
        try {
            File file = new File(filename);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println(gson.toJson(vehicles));
            printWriter.close();
            System.out.println("Коллекция записана в файл.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/

    /* public static void toCsv(TreeMap<Integer, Movie> movies) {
        String recordAsCsv = "";
        for (Map.Entry<Integer,Movie> entry :  movies.entrySet()) {
            Movie movie = entry.getValue();
                   movie.toCsvRow()
                    .collect(Collectors.joining(System.getProperty("line.separator")));

    } }*/
}


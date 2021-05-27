package Lab5.Util;

import java.io.*;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * The type File reader.
 */
public class FileReader {
    private static final String envPath = System.getenv("collection");

    /**
     * Get file path string.
     *
     * @return the string
     */
    public static String getFilePath(){
        return envPath;
    }


    /**
     *
     * @param filename the file name
     * @return the data
     */
    public static String readFromFile(String filename){
        try {
            Path path = Paths.get(filename);
            Scanner sc = new Scanner(path);
            String data ="";
            while(sc.hasNextLine()){
                data += sc.nextLine();
            }
            FileWriter.setFilename(filename);
            sc.close();
            return data;
        } catch (NullPointerException | NoSuchFileException e) {
            e.printStackTrace();
            System.out.println("Вы указали неверное название файла");
            System.exit(1);
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }


}
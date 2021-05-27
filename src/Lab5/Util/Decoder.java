package Lab5.Util;

import Lab5.MovieStuff.*;

import java.time.LocalDateTime;
import java.util.TreeMap;

public class Decoder {

    public static void fillCollection(String data){
        TreeMap<Integer, Movie> collection = new TreeMap<>();
        System.out.println("Вход в метод декодера");
        if (data==null) System.out.println("Указанный файл не найден.Коллекция пустая.");
        else {
            try {
                System.out.println("Вход в трай декодера");
                String[] splitedData = data.split("\n");
                String[] splitedLine = splitedData[0].split(",");
                if (splitedData.length==1){
                    System.out.println("Вход в иф декодера");
                    decoderer(collection, splitedLine);
                }
                else {
                    for(int i=1; i<splitedData.length;i++){
                        System.out.println("Вход в цикл декодера");
                        decoderer(collection, splitedLine);
                        if (!(splitedData[i].equals(""))) {
                            splitedLine = splitedData[i].split(",");
                        }
                    }
                }

                MovieCollection.setCollection(collection);
                System.out.println("Коллекция успешно заполнена. \n");
            } catch (NullPointerException e){
                e.printStackTrace();
                System.out.println("В файле указаны некорретные данные. Коллекция пустая.");
            }
        }


    }

    private static void decoderer(TreeMap<Integer, Movie> collection, String[] splitedLine) {
        Movie movie = new Movie();
        movie.setId(Integer.parseInt(splitedLine[0]));
        movie.setName(splitedLine[1]);
        Coordinates coordinates = new Coordinates();
        coordinates.setX(Integer.parseInt(splitedLine[2]));
        coordinates.setY(Float.parseFloat(splitedLine[3]));
        movie.setCoordinates(coordinates);
       // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-ddThh:mm:ss");
        movie.setCreationDate(LocalDateTime.parse(splitedLine[4]/*, formatter)*/));
        movie.setOscarsCount(Long.parseLong(splitedLine[5]));
        movie.setGenre(MovieGenre.valueOf(splitedLine[6]));
        movie.setMpaaRating(MpaaRating.valueOf(splitedLine[7]));
        Person person = new Person();
        person.setName(splitedLine[8]);
        person.setPassportID(splitedLine[9]);
        person.setEyeColor(Color.valueOf(splitedLine[10]));
        person.setHairColor(HairColor.valueOf(splitedLine[11]));
        person.setNationality(Country.valueOf(splitedLine[12]));
        Location location = new Location();
        location.setName(splitedLine[13]);
        location.setX(Integer.parseInt(splitedLine[14]));
        location.setY(Float.parseFloat(splitedLine[15]));
        person.setLocation(location);
        movie.setPerson(person);
        System.out.println(movie.getInfo());
        collection.put(movie.getId(),movie);
    }
}

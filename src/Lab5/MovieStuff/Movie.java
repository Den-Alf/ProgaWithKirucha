package Lab5.MovieStuff;

import Lab5.MovieStuff.Coordinates;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * The type Movie.
 */
public class Movie implements Comparable{
    private int id; //Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Coordinates coordinates; //Поле не может быть null
    private java.time.LocalDateTime creationDate; //Поле не может быть null, Значение этого поля должно генерироваться автоматически
    private long oscarsCount; //Значение поля должно быть больше 0
    private MovieGenre genre; //Поле может быть null
    private MpaaRating mpaaRating; //Поле не может быть null
    private Person screenwriter;

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets coordinates.
     *
     * @return the coordinates
     */
    public Coordinates getCoordinates() {
        return coordinates;
    }

    /**
     * Sets coordinates.
     *
     * @param coordinates the coordinates
     */
    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    /**
     * Gets creation date.
     *
     * @return the creation date
     */
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Sets creation date.
     *
     * @param creationDate the creation date
     */
    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * Gets oscars count.
     *
     * @return the oscars count
     */
    public long getOscarsCount() {
        return oscarsCount;
    }

    /**
     * Sets oscars count.
     *
     * @param oscarsCount the engine power
     */

    public void setOscarsCount(long oscarsCount) {
        this.oscarsCount = oscarsCount;
    }

    /**
     * Gets genre.
     *
     * @return the genre
     */
    public MovieGenre getGenre() {
        return genre;
    }

    /**
     * Sets genre.
     *
     * @param genre the genre
     */
    public void setGenre(MovieGenre genre) {
        this.genre = genre;
    }

    /**
     * Gets mpaa rating.
     *
     * @return the mpaa rating
     */
    public MpaaRating getMpaaRating() {
        return mpaaRating;
    }

    /**
     * Sets mpaa rating.
     *
     * @param mpaaRating the mpaa rating
     */
    public void setMpaaRating(MpaaRating mpaaRating) {
        this.mpaaRating = mpaaRating;
    }


    public Person getPerson() { return screenwriter;}

    public void setPerson(Person person){this.screenwriter = person;}


    /**
     * Gets info.
     *
     * @return the info
     */
    public String getInfo() {
        return "Фильм [id:" + id + "]:\n\t" + "Название: " + name + "\n\tКоординаты:\n\t\tx: " + coordinates.getX() +
                "\n\t\ty: " + coordinates.getY() +  "\n\tДата cоздания: " + creationDate + "\n\tКоличество оскаров: " + oscarsCount +
                "\n\tЖанр фильма: "+ genre + "\n\tРейтинг: " + mpaaRating + "\n\tСценарист:\n\t\t Имя сценариста: " + screenwriter.getName();
    }


    public String toCsvRow() {
        String csvRow = "";
        for (Object value : Arrays.asList(id,name,coordinates,creationDate,oscarsCount,genre,mpaaRating,screenwriter)) {
            String processed = (String)value;
            if (((String) value).contains("\"") || ((String) value).contains(",")) {
                processed = "\"" + ((String) value).replaceAll("\"", "\"\"") + "\"";
            }
            csvRow += "," + processed;
        }
        return csvRow.substring(1);
    }


    @Override
    public int compareTo(Object o) {
        Movie movie= (Movie)o;
        return (int) (this.getOscarsCount()-movie.getOscarsCount());
    }


    @Override
    public String toString() {
        String s = id+","+name+","+coordinates.getX()+","+
                coordinates.getY()+","+creationDate+","+oscarsCount+","+genre+","+
                mpaaRating+","+screenwriter.getName()+","+screenwriter.getPassportID()+","+
                screenwriter.getEyeColor()+","+screenwriter.getHairColor()+","+
                screenwriter.getNationality()+","+screenwriter.getLocation().getName()+","+
                screenwriter.getLocation().getX()+","+screenwriter.getLocation().getY();
        System.out.println("Ту стринг мови сработал");
        return s;
    }
}



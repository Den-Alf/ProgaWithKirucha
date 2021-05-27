package Lab5.Util;

import Lab5.MovieStuff.*;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The type Vehicle creater.
 */
public class MovieCreater {
    private final Scanner scanner = new Scanner(System.in);

    /**
     * Create vehicle.
     *
     * @param id the id
     * @return the vehicle
     */
    public Movie create(String id) {
        Movie movie = new Movie();

        if(id.equals("free")) {
            movie.setId((int) MovieCollection.getFreeId());
        }
        else{
            movie.setId(Integer.parseInt((String) id));
        }
        this.setName(movie);
        Coordinates coordinates = new Coordinates();
        this.setCoordinateX(coordinates);
        this.setCoordinateY(coordinates);
        movie.setCoordinates(coordinates);
        movie.setCreationDate(LocalDateTime.now());
        this.setOscarsCount(movie);
        this.setMovieGenre(movie);
        this.setMpaaRating(movie);
        Person person = new Person();
        this.setPersonName(person);
        this.setPersonId(person);
        this.setPersonEye(person);
        this.setPersonHair(person);
        this.setPersonCountry(person);
        Location location = new Location();
        this.setLocX(location);
        this.setLocY(location);
        this.setLocName(location);
        person.setLocation(location);
        movie.setPerson(person);

        return movie;

    }


    /**
     * Sets name.
     *
     * @param movie the movie
     */
    public void setName(Movie movie) {
        System.out.println("Введите имя транспорта.");
        System.out.print("~ ");
        String name = scanner.nextLine();
        if (name.equals("") || name.equals("null")) {
            this.setName(movie);
        } else movie.setName(name);
    }

    /**
     * Sets coordinate x.
     *
     * @param coords the coords
     */
    public void setCoordinateX(Coordinates coords) {
        try {
            System.out.println("Введите координату x:");
            System.out.print("~ ");
            String x = scanner.nextLine();
            if (x.equals("") || x.equals(null)) this.setCoordinateX(coords);
            else {
                int xn = Integer.parseInt(x);
                if (xn <= 906) {
                    coords.setX(xn);
                } else {
                    System.out.println("Максимальное значение поля: 906");
                    this.setCoordinateX(coords);
                }
                coords.setX(xn);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Значение должно быть типа:\"int\".");
            this.setCoordinateX(coords);
        }
    }

    /**
     * Sets coordinate y.
     *
     * @param coords the coords
     */
    public void setCoordinateY(Coordinates coords) {
        try {
            System.out.println("Введите координату y:");
            System.out.print("~ ");
            String y = scanner.nextLine();
            if (y.equals("") || y.equals(null)) this.setCoordinateY(coords);
            else {
                float xn = Float.parseFloat(y);
                coords.setY(xn);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Значение должно быть типа:\"float\".");
            this.setCoordinateY(coords);
        }
    }

    /**
     * Sets engine power.
     *
     * @param movie the movie
     */
    public void setOscarsCount(Movie movie) {
        try {
            System.out.println("Введите мощь двигателя:");
            System.out.print("~ ");
            String x = scanner.nextLine();
            long xn = Integer.parseInt(x);
            if (xn<=0) {
                System.out.println("Значение поля должно быть больше 0,попробуйте ещё раз.");
                this.setOscarsCount(movie);
            }
            else movie.setOscarsCount(xn);
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Значение должно быть типа:\"long\".");
            this.setOscarsCount(movie);
        }
    }

    /**
     * Sets movie type.
     *
     * @param movie the movie
     */
    public void setMovieGenre(Movie movie) {
        System.out.println("Введите тип транспорта,регистр не важен.(HELICOPTER,DRONE,SHIP,CHOPPER,HOVERBOARD):");
        System.out.print("~ ");
        String dif = scanner.nextLine().toUpperCase();
        try {
            movie.setGenre(MovieGenre.valueOf(dif));
        } catch (Exception e) {
            System.out.println("Значение должно соответствовать перечислинным типам. Введите значение:");
            this.setMovieGenre(movie);
        }
    }

    /**
     * Sets fuel type.
     *
     * @param movie the movie
     */
    public void setMpaaRating(Movie movie) {
        System.out.println("Введите тип топлива,регистр не важен.(ELECTRICITY,DIESEL,PLASMA):");
        System.out.print("~ ");
        String dif = scanner.nextLine().toUpperCase();
        try {
            movie.setMpaaRating(MpaaRating.valueOf(dif));
        } catch (Exception e) {
            System.out.println("Значение должно соответствовать перечислинным типам. Введите значение:");
            this.setMpaaRating(movie);
        }
    }

    public void setPersonName(Person person) {
        System.out.println("Введите имя транспорта.");
        System.out.print("~ ");
        String name = scanner.nextLine();
        if (name.equals("") || name.equals("null")) {
            this.setPersonName(person);
        } else person.setName(name);
    }


    public void setPersonId (Person person) {
        System.out.println("Введите имя транспорта.");
        System.out.print("~ ");
        String id = scanner.nextLine();
        if (id.equals("") || id.equals("null")) {
            this.setPersonId(person);
        } else person.setPassportID(id);
    }


    public void setPersonEye(Person person) {
        System.out.println("Введите тип транспорта,регистр не важен.(HELICOPTER,DRONE,SHIP,CHOPPER,HOVERBOARD):");
        System.out.print("~ ");
        String dif = scanner.nextLine().toUpperCase();
        try {
            person.setEyeColor(Color.valueOf(dif));
        } catch (Exception e) {
            System.out.println("Значение должно соответствовать перечислинным типам. Введите значение:");
            this.setPersonEye(person);
        }
    }

    public void setPersonHair(Person person) {
        System.out.println("Введите тип транспорта,регистр не важен.(HELICOPTER,DRONE,SHIP,CHOPPER,HOVERBOARD):");
        System.out.print("~ ");
        String dif = scanner.nextLine().toUpperCase();
        try {
            person.setHairColor(HairColor.valueOf(dif));
        } catch (Exception e) {
            System.out.println("Значение должно соответствовать перечислинным типам. Введите значение:");
            this.setPersonHair(person);
        }
    }

    public void setPersonCountry(Person person) {
        System.out.println("Введите тип транспорта,регистр не важен.(HELICOPTER,DRONE,SHIP,CHOPPER,HOVERBOARD):");
        System.out.print("~ ");
        String dif = scanner.nextLine().toUpperCase();
        try {
            person.setNationality(Country.valueOf(dif));
        } catch (Exception e) {
            System.out.println("Значение должно соответствовать перечислинным типам. Введите значение:");
            this.setPersonCountry(person);
        }
    }


    public void setLocX(Location loc) {
        try {
            System.out.println("Введите координату x:");
            System.out.print("~ ");
            String x = scanner.nextLine();
            if (x.equals("") || x.equals(null)) this.setLocX(loc);
            else {
                int xn = Integer.parseInt(x);
                loc.setX(xn);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            e.printStackTrace();
            System.out.println("Значение должно быть типа:\"int\".");
            this.setLocX(loc);
        }
    }

    public void setLocY(Location loc) {
        try {
            System.out.println("Введите координату y:");
            System.out.print("~ ");
            String y = scanner.nextLine();
            if (y.equals("") || y.equals(null)) this.setLocY(loc);
            else {
                double xn = Double.parseDouble(y);
                loc.setY(xn);
            }
        } catch (InputMismatchException | NumberFormatException e) {
            System.out.println("Значение должно быть типа:\"double\".");
            this.setLocY(loc);
        }
    }

    public void setLocName(Location loc) {
        System.out.println("Введите имя транспорта.");
        System.out.print("~ ");
        String name = scanner.nextLine();
        if (name.equals("") || name.equals("null")) {
            this.setLocName(loc);
        } else loc.setName(name);
    }

}

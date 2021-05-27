package Lab5.MovieStuff;

public class Person {
    private String name; //Поле не может быть null, Строка не может быть пустой
    private String passportID; //Поле может быть null
    private Color eyeColor; //Поле не может быть null
    private HairColor hairColor; //Поле может быть null
    private Country nationality; //Поле не может быть null
    private Location location; //Поле не может быть null
    public String getName() {
        return name;
    }


    public void setLocation(Location location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getEyeColor() {
        return eyeColor;
    }

    public Country getNationality() {
        return nationality;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setEyeColor(Color eyeColor) {
        this.eyeColor = eyeColor;
    }

    public Location getLocation() {
        return location;
    }

    public String getPassportID() {
        return passportID;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public void setNationality(Country nationality) {
        this.nationality = nationality;
    }

    public void setPassportID(String passportID) {
        this.passportID = passportID;
    }
    /*
    public String LocationInfo() {
        String a = "\n\t\ty: " + location.getX() + "\n\t\ty: " + location.getY() + "\n\t\ty: " + location.getName();
        return a;
    }
    public String Info() {
        String a = "\n\t\ty: " + name + "\n\t\ty: " + passportID + "\n\t\ty: " + location.getName();
        return a;
    }*/
}

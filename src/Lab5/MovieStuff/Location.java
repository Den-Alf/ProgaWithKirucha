package Lab5.MovieStuff;

public class Location {
    private int x;
    private double y;
    private String name; //Поле может быть null

    public void setX(int x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public String getName() {
        return name;
    }
}

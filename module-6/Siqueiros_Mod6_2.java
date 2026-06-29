/*
 * Name: Sebastian Siqueiros
 * Assignment: 6.2
 * Course: CSD-402
 *
 * This program creates a Fan class with constructors,
 * constants, getters, setters, and a toString() method.
 * The program tests two Fan objects using both constructors.
 */

class Fan {

    // Constants
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    // Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    // Default constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    // Argument constructor
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    // Getters
    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    // Setters
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString()
    public String toString() {

        if (on) {
            return "Fan is ON\n" +
                   "Speed: " + speed +
                   "\nColor: " + color +
                   "\nRadius: " + radius;
        }

        return "Fan is OFF\n" +
               "Color: " + color +
               "\nRadius: " + radius;
    }
}

public class Siqueiros_Mod6_2 {

    public static void main(String[] args) {

        // Default fan
        Fan fan1 = new Fan();

        // Fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        System.out.println("Default Fan");
        System.out.println("----------------");
        System.out.println(fan1);

        System.out.println();

        System.out.println("Argument Constructor Fan");
        System.out.println("------------------------");
        System.out.println(fan2);

        System.out.println();

        // Testing setters
        fan1.setOn(true);
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(8);
        fan1.setColor("black");

        System.out.println("Modified Default Fan");
        System.out.println("--------------------");
        System.out.println(fan1);
    }
}
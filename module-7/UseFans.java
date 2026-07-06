/*
 * Name: Sebastian Siqueiros
 * Assignment: 7.2
 * Course: CSD-402
 *
 * This program creates a collection of Fan objects using
 * an ArrayList. It uses methods to display one Fan and
 * all Fans in the collection without using the toString()
 * method. The Fan class also uses the "this" reference
 * wherever allowed.
 */

import java.util.ArrayList;

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
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6;
        this.color = "white";
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
        return this.speed;
    }

    public boolean isOn() {
        return this.on;
    }

    public double getRadius() {
        return this.radius;
    }

    public String getColor() {
        return this.color;
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
}

public class UseFans {

    // Method to display one Fan
    public static void displayFan(Fan fan) {

        System.out.println("----------------------------");

        if (fan.isOn()) {
            System.out.println("Fan Status: ON");
            System.out.println("Speed: " + fan.getSpeed());
        } else {
            System.out.println("Fan Status: OFF");
        }

        System.out.println("Color: " + fan.getColor());
        System.out.println("Radius: " + fan.getRadius());
    }

    // Method to display all Fans in the collection
    public static void displayFans(ArrayList<Fan> fans) {

        int fanNumber = 1;

        for (Fan fan : fans) {
            System.out.println("Fan #" + fanNumber);
            displayFan(fan);
            fanNumber++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        // Create a collection of Fan objects
        ArrayList<Fan> fans = new ArrayList<>();

        // Add Fan objects to the collection
        fans.add(new Fan());

        fans.add(new Fan(Fan.FAST, true, 10, "blue"));

        fans.add(new Fan(Fan.MEDIUM, true, 8, "black"));

        fans.add(new Fan(Fan.SLOW, false, 7, "green"));

        // Display all Fan objects
        displayFans(fans);
    }
}
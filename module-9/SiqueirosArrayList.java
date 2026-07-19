/*
 * Name: Sebastian Siqueiros
 * Course: CSD 402
 * Module: 9
 * Assignment: Program 1
 * Date: July 2026
 *
 * Description:
 * This program creates an ArrayList containing ten String values.
 * It displays the contents using a for-each loop, prompts the user
 * to enter the index of an element they would like to view again,
 * and uses a try/catch block to handle invalid indexes.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SiqueirosArrayList {

    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Create an ArrayList of Strings
        ArrayList<String> animals = new ArrayList<>();

        // Add ten String values to the ArrayList
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Horse");
        animals.add("Tiger");
        animals.add("Lion");
        animals.add("Bear");
        animals.add("Wolf");
        animals.add("Fox");
        animals.add("Rabbit");
        animals.add("Eagle");

        // Display all elements using a for-each loop
        System.out.println("Animals in the ArrayList:");

        for (String animal : animals) {
            System.out.println(animal);
        }

        // Ask the user which element they want to see again
        System.out.print("\nEnter the element number (0-9) you would like to display again: ");

        try {

            // Autoboxing: converts the primitive int value into an Integer object
            Integer choice = Integer.valueOf(scanner.nextLine());

            // Auto-Unboxing: Integer is automatically converted back to an int
            System.out.println("\nYou selected: " + animals.get(choice));

        }

        // Handles invalid ArrayList indexes
        catch (IndexOutOfBoundsException e) {

            System.out.println("\nException has been thrown: Out of Bounds");

        }

        // Handles non-numeric input
        catch (NumberFormatException e) {

            System.out.println("\nPlease enter a valid number.");

        }

        // Close the Scanner
        scanner.close();

    }
}
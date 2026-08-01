/*
 * Name: Sebastian Siqueiros
 * Course: CSD 402
 * Module: 11.3
 * Discription: This program calculates the amount of energy needed to heat water using the formula provided in the assignment
 * Date: August 2026
 */

import java.util.Scanner;

public class SiqueirosModule11 {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variables
        double waterMass;
        double initialTemperature;
        double finalTemperature;
        double energy;

        // Get user input
        System.out.print("Enter the amount of water in kilograms: ");
        waterMass = input.nextDouble();

        System.out.print("Enter the initial temperature (Celsius): ");
        initialTemperature = input.nextDouble();

        System.out.print("Enter the final temperature (Celsius): ");
        finalTemperature = input.nextDouble();

        // Calculate energy
        energy = waterMass * (finalTemperature - initialTemperature) * 4184;

        // Display result
        System.out.println();
        System.out.println("Energy needed: " + energy + " Joules");

        // Close Scanner
        input.close();
    }
}
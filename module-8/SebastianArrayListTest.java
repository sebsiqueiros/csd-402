/*
 * Name: Sebastian Siqueiros
 * Course: CSD-402
 * Assignment: Module 8.2
 * Purpose: Store user-entered integers in an ArrayList
 * and return the largest value.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class SebastianArrayListTest {

    // Method that returns the largest value in the ArrayList
    public static Integer max(ArrayList<Integer> list) {

        // Return 0 if the list is empty
        if (list.isEmpty()) {
            return 0;
        }

        // Assume the first number is the largest
        Integer largest = list.get(0);

        // Compare every number in the list
        for (Integer number : list) {

            if (number > largest) {
                largest = number;
            }

        }

        return largest;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("Enter integers.");
        System.out.println("Enter 0 when you are finished.");

        int value;

        do {

            System.out.print("Enter an integer: ");

            value = input.nextInt();

            numbers.add(value);

        } while (value != 0);

        Integer largestNumber = max(numbers);

        System.out.println();

        System.out.println("The largest value is: " + largestNumber);

        input.close();

    }

}
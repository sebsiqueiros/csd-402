/*
 * Name: Sebastian Siqueiros
 * Course: CSD 402
 * Module 9 Assignment
 * Program 2
 *
 * Creates a file called data.file if it does not exist,
 * appends 10 random integers,
 * then reads the file and displays its contents.
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SiqueirosFileProgram {

    public static void main(String[] args) {

        File file = new File("data.file");
        Random random = new Random();

        try {

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }

            // Open the file in append mode
            FileWriter writer = new FileWriter(file, true);

            // Write 10 random integers
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + " ");
            }

            // Move to the next line
            writer.write(System.lineSeparator());

            // Close the file
            writer.close();

            System.out.println("\nContents of data.file:");

            // Reopen and read the file
            Scanner reader = new Scanner(file);

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

            reader.close();

        } catch (IOException e) {

            System.out.println("An error occurred.");
            e.printStackTrace();

        }

    }

}
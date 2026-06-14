/*
 * Name: Sebastian Siqueiros, Module 2.2 Assignment, June 14, 2026
 * Assignment: Rock-Paper-Scissors
 */
3
import java.util.Scanner;
import java.util.Random;

public class Module2_2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number from 1 to 3
        int computerChoice = random.nextInt(3) + 1;

        // Ask the user for their choice
        System.out.println("Rock-Paper-Scissors");
        System.out.println("1 = Rock");
        System.out.println("2 = Paper");
        System.out.println("3 = Scissors");
        System.out.print("Enter your choice (1, 2, or 3): ");

        int userChoice = input.nextInt();

        // Convert computer choice to words
        String computerSelection;
        if (computerChoice == 1) {
            computerSelection = "Rock";
        } else if (computerChoice == 2) {
            computerSelection = "Paper";
        } else {
            computerSelection = "Scissors";
        }

        // Convert user choice to words
        String userSelection;
        if (userChoice == 1) {
            userSelection = "Rock";
        } else if (userChoice == 2) {
            userSelection = "Paper";
        } else {
            userSelection = "Scissors";
        }

        // Display selections
        System.out.println("\nComputer selected: " + computerSelection);
        System.out.println("You selected: " + userSelection);

        // Determine the winner
        if (computerChoice == userChoice) {
            System.out.println("Result: It's a tie!");
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("Result: You win!");
        } else {
            System.out.println("Result: Computer wins!");
        }

        input.close();
    }
}



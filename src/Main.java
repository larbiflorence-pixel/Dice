import java.util.Random;
import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==========================================");
        System.out.println("           JAVA DICE ROLLER APP           ");
        System.out.println("==========================================");

        boolean playAgain = true;

        while (playAgain) {
            System.out.print("\nEnter the number of dice to roll: ");
            int numDice = scanner.nextInt();

            System.out.print("Enter the number of sides per die (e.g., 6, 12, 20): ");
            int numSides = scanner.nextInt();

            int totalSum = 0;
            System.out.print("Roll Results: [ ");

            for (int i = 0; i < numDice; i++) {
                // random.nextInt(numSides) generates from 0 to numSides-1, so we add 1
                int roll = random.nextInt(numSides) + 1;
                totalSum += roll;
                System.out.print(roll + " ");
            }

            System.out.println("]");
            System.out.println("------------------------------------------");
            System.out.println("Total Sum: " + totalSum);
            System.out.println("------------------------------------------");

            System.out.print("Would you like to roll again? (y/n): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("y")) {
                playAgain = false;
                System.out.println("Thanks for using Dice Roller. Goodbye!");
            }
        }

        scanner.close();
    }
}
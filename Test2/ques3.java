import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a list of numbers (enter a negative number to calculate the average):");

        int sum = 0;
        int count = 0;
        int number;

       
        do {
            number = scanner.nextInt();

            if (number >= 0) {
                sum += number;
                count++;
            }
        } while (number >= 0);

        // Calculate the average
        double average = (double) sum / count;

        // Print the average
        System.out.println("Average: " + average);

      
    }
}

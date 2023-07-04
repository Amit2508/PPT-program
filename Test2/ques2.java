import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the limit for Fibonacci series: ");
        int limit = scanner.nextInt(); // upto which you want fibonacci series

        
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci series up to " + limit + ": " + num1 + ", " + num2);

        for (int i = 2; i < limit; i++) {
            int nextNum = num1 + num2;
            System.out.print(", " + nextNum);

            num1 = num2;
            num2 = nextNum;
        }

       
    }
}

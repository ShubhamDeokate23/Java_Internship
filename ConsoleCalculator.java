import java.util.Scanner;

public class ConsoleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nSelect operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Temperature Conversion (Celsius to Fahrenheit)");
            System.out.println("7. Currency Conversion (INR to USD)");
            System.out.println("8. Exit");
            
            int choice = scanner.nextInt();
            if (choice == 8) break;
            
            double num1, num2;
            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Square Root: " + Math.sqrt(num1));
                    break;
                case 6:
                    System.out.print("Enter temperature in Celsius: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Fahrenheit: " + ((num1 * 9/5) + 32));
                    break;
                case 7:
                    System.out.print("Enter amount in INR: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Approximate USD (assuming 1 USD = 83 INR): " + (num1 / 83));
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        scanner.close();
        System.out.println("Calculator closed.");
    }
}
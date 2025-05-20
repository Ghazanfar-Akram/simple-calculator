import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int repeat_process;
        do {
            System.out.println("\nWorking Calculator");
            System.out.println("\nEnter your preference: ");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Division");
            System.out.println("4. Multiplication");
            System.out.println("5. Square");
            System.out.println("6. Square Root");
            System.out.print(">> ");
            int choice = input.nextInt();

            double num1, num2;

            switch (choice) {
                case 1:
                    System.out.println("Selected Addition");
                    System.out.print("Number 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Number 2: ");
                    num2 = input.nextDouble();
                    System.out.println("The addition: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Selected Subtraction");
                    System.out.print("Number 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Number 2: ");
                    num2 = input.nextDouble();
                    System.out.println("The subtraction: " + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Selected Division");
                    System.out.print("Number 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Number 2: ");
                    num2 = input.nextDouble();
                    if (num2 != 0) {
                        System.out.println("The division: " + (num1 / num2));
                    } else {
                        System.out.println("Error: Cannot divide by zero!");
                    }
                    break;

                case 4:
                    System.out.println("Selected Multiplication");
                    System.out.print("Number 1: ");
                    num1 = input.nextDouble();
                    System.out.print("Number 2: ");
                    num2 = input.nextDouble();
                    System.out.println("The multiplication: " + (num1 * num2));
                    break;

                case 5:
                    System.out.println("Selected Square");
                    System.out.print("Give a number: ");
                    num1 = input.nextDouble();
                    System.out.println("The square: " + (num1 * num1));
                    break;

                case 6:
                    System.out.println("Selected Square Root");
                    System.out.print("Give a number: ");
                    num1 = input.nextDouble();
                    if (num1 >= 0) {
                        double squareroot = Math.sqrt(num1);
                        System.out.println("The square root: " + squareroot);
                    } else {
                        System.out.println("Error: Cannot compute square root of a negative number!");
                    }
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nEnter 1 to repeat or 0 to stop: ");
            repeat_process = input.nextInt();

        } while (repeat_process == 1);

        input.close();
        System.out.println("Calculator closed. Thank you!");
    }
}

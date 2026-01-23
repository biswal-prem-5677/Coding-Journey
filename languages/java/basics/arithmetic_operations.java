import java.util.Scanner;

class ArithmeticOperations {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt(); 

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;

        if (num2 != 0) {
            int quotient = num1 / num2;
            int remainder = num1 % num2;

            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Quotient: " + quotient);
            System.out.println("Remainder: " + remainder);
        } 
	else {
            System.out.println("Sum: " + sum);
            System.out.println("Difference: " + difference);
            System.out.println("Product: " + product);
            System.out.println("Cannot divide by zero!");
        }        
    }
}

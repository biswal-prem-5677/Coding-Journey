import java.util.Scanner;

class SwitchCalculator {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter operation (+, -, *, /): ");
        char op = sc.next().charAt(0);

        int result;

        switch (op) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
		    int remainder = num1 % num2;
                    System.out.println("Result: " + result);
		    System.out.println("Remainder: " + remainder);
                } 
		else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid operator! Please enter +, -, *, or /.");
        }
    }
}

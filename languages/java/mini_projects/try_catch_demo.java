import java.util.Scanner;

public class ArithmeticExceptionExample {
    	public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);

        	System.out.println("Enter numerator: ");
        	int numerator = sc.nextInt();

        	System.out.println("Enter denominator: ");
        	int denominator = sc.nextInt();

        	try {
            	int result = numerator / denominator;
            	System.out.println("Result: " + result);
        	} 
		catch (ArithmeticException e) {
            	System.out.println("Error: Division by zero is not allowed!");
        	}

        	System.out.println("Program continues after exception handling...");

        	sc.close();
    	}
}

import java.util.Scanner;
import java.io.*;

public class ATM {
    	private static int balance = 20000;   
    	private static String pin = "1234";
    	private static Scanner sc = new Scanner(System.in);
        private static int amount;
    	public static void main(String arg[]) {
        	
        	System.out.print("Enter PIN: ");
        	String enteredPin = sc.nextLine();
        	if (!enteredPin.equals(pin)) {
            		System.out.println("Invalid PIN. Exiting...");
            		return;
        	}

        	while (true) {
            		System.out.println("\n===== MENU =====");
            		System.out.println("1. Cash Withdrawal");
            		System.out.println("2. Cash Deposit");
            		System.out.println("3. Balance Check");
            		System.out.println("4. PIN Change");
            		System.out.println("5. Cash Transfer");
            		System.out.println("6. Exit");
            		System.out.print("Enter choice: ");
            		int choice = sc.nextInt();

            		switch (choice) {
                		case 1: 
					Withdraw(); 
					break;
                		case 2: 
					Deposit(); 
					break;
                		case 3: 
					CheckBalance(); 
					break;
                		case 4: 
					ChangePin(); 
					break;
                		case 5: 
					Transfer(); 
					break;
                		case 6: 
                    			System.out.println("Thank you for using ATM!");
                    			return;
                		default: 
					System.out.println("Invalid choice. Try again.");
            		}
        	}
	}

    	private static void Withdraw() {
        	System.out.print("Enter amount to withdraw: ");
        	amount = sc.nextInt();
        	if (amount > 0 && amount <= balance) {
            		balance -= amount;
            		System.out.println("Collect your cash: " + amount);
        	} 
		else {
            		System.out.println("Invalid or Insufficient Balance.");
        	}
    	}

    	private static void Deposit() {
        	System.out.print("Enter amount to deposit: ");
        	amount = sc.nextInt();
        	if (amount > 0) {
            		balance += amount;
            		System.out.println("Deposited: " + amount);
        	} 
		else {
            	System.out.println("Invalid amount.");
        	}
    	}

    	private static void CheckBalance() {
        	System.out.println("Available Balance: " + balance);
    	}

    	private static void ChangePin() {
		//flush();
        	System.out.print("Enter Old PIN: ");
        	String oldPin = sc.nextLine();

        	if (oldPin.equals(pin)) {
            		System.out.print("Enter new PIN: ");
            		String newPin = sc.nextLine();
            		pin = newPin;
            		System.out.println("PIN changed successfully!");
        	} 	
		else {
            		System.out.println("Incorrect PIN.");
        	}
    	}

    	private static void Transfer() {
        	System.out.print("Enter recipient account number: ");
		try
		{
        		String RecipientAccount = sc.nextLine();
		}
		catch(Exception e)
		{
			RecipientAccount="PNUB1234";
		} 
        	System.out.print("Enter amount to transfer: ");
        	amount = sc.nextInt();
        	if (amount > 0 && amount <= balance) {
            		balance -= amount;
            		System.out.println("Transferred " + amount + " successfully!");
        	} 
		else {
            		System.out.println("Invalid or Insufficient Balance.");
        	}
    	}
}

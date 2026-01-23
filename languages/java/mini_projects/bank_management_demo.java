import java.util.Scanner;

class Bank {
    	void RateOfInterest() {
        	System.out.println("Rate of Interest: 0.00%");
    	}

    	void BankDetails() {
        	System.out.println("Bank: Parent Bank");
    	}
}

class SBI extends Bank {
    	void RateOfInterest() {
        	System.out.println("SBI Rate of Interest: 6.50%");
    	}

    	void BankDetails() {
        	System.out.println("Bank: State Bank of India\nBranch: SORO");
    	}
}

class PNB extends Bank {
    	void RateOfInterest() {
        	System.out.println("PNB Rate of Interest: 7.90%");
    	}

    	void BankDetails() {
        	System.out.println("Bank: Punjab National Bank\nBranch: MANGALPUR");
    	}
}

public class BankDemo {
    	public static void main(String arg[]) {
        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter Bank Name (SBI/PNB): ");
        	String BankName = sc.nextLine().trim().toUpperCase();

        	Bank ref;

        	if (BankName.equals("SBI")) {
            		ref = new SBI();
        	} else if (BankName.equals("PNB")) {
            		ref = new PNB();
        	} else {
            		System.out.println("Invalid Bank Name!");
			sc.close();
    			return;
        	}

        	System.out.println("\nBank Details:");
        	ref.BankDetails();
        	ref.RateOfInterest();

        	sc.close();
    	}
}


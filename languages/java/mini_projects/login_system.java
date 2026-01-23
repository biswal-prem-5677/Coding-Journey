import java.util.Scanner;

class LoginSystem {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        String correctPassword = "java123"; 
        String enteredPassword;

        do {
            System.out.print("Enter password: ");
            enteredPassword = sc.nextLine();

            if (!enteredPassword.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.\n");
            }
        } while (!enteredPassword.equals(correctPassword));

        System.out.println("Login successful!");
    }
}

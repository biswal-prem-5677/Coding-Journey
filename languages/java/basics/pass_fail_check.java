import java.util.Scanner;

class PassFailCheck {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student's mark: ");
        int mark = sc.nextInt();

        if (mark >= 40) {
            System.out.println("Pass");
        } 
	else {
            System.out.println("Fail");
        }
    }
}

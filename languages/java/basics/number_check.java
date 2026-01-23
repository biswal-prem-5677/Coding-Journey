import java.util.Scanner;

class NumberCheck {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 0) {
            if (num == 0) {
                System.out.println("The number is Zero.");
            } else {
                System.out.println("The number is Positive.");
            }
        } else {
            System.out.println("The number is Negative.");
        }
    }
}

import java.util.Scanner;

class BitwiseOperations {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = sc.nextInt();

        int andResult = num1 & num2;  
        int orResult = num1 | num2;   
        int xorResult = num1 ^ num2;  
        int notNum1 = ~num1;          
        int notNum2 = ~num2;          

        System.out.println("num1 & num2 = " + andResult);
        System.out.println("num1 | num2 = " + orResult);
        System.out.println("num1 ^ num2 = " + xorResult);
        System.out.println("~num1 = " + notNum1);
        System.out.println("~num2 = " + notNum2);
    }
}
